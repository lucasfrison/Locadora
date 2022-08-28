/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.dao;

import br.com.locadora.gerenciadorveiculos.factory.ConnectionFactory;
import br.com.locadora.gerenciadorveiculos.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucfg
 */
public class ClienteDAO {
    
    ConnectionFactory connectionFactory;

    public ClienteDAO() {
        connectionFactory = new ConnectionFactory();
    }

    public void adicionarCliente(Cliente cliente) {
        try (Connection connection = connectionFactory.getConexao()) {
            String sql = "INSERT INTO CLIENTE (NOME, SOBRENOME, RG, CPF, ENDERECO) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, cliente.getNome());
		pstm.setString(2, cliente.getSobrenome());
                pstm.setString(3, cliente.getRG());
                pstm.setString(4, cliente.getCPF());
                pstm.setString(5, cliente.getEndereco());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Cliente> listarClientes() {
	List<Cliente> clientes = new ArrayList<>();
	try (Connection connection = connectionFactory.getConexao()){
            String sql = "SELECT NOME, SOBRENOME, RG, CPF, ENDERECO FROM CLIENTE";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();
		popularListaClientes(clientes, pstm);
            }
            
            return clientes;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void removerCliente(Cliente cliente) {
        try (Connection connection = connectionFactory.getConexao()) {
            try (PreparedStatement stm = connection.prepareStatement("DELETE FROM CLIENTE WHERE CPF = ?")) {
                stm.setString(1, cliente.getCPF());
                stm.execute();
            }    
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    
    public void alterarCliente(Cliente cliente) {
        try (Connection connection = connectionFactory.getConexao()) {
            try (PreparedStatement stm = connection
                .prepareStatement("UPDATE CLIENTE C SET C.NOME = ?, C.SOBRENOME = ?, C.RG = ?, C.ENDERECO = ? WHERE CPF = ?")) {
                stm.setString(1, cliente.getNome());
                stm.setString(2, cliente.getSobrenome());
                stm.setString(3, cliente.getRG());
                stm.setString(4, cliente.getEndereco());
                stm.setString(5, cliente.getCPF());
                stm.execute();
            }    
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    
    private void popularListaClientes(List<Cliente> clientes, PreparedStatement pstm) throws SQLException {
	
        try (ResultSet rst = pstm.getResultSet()) {
            while (rst.next()) {
		Cliente cliente = new Cliente(rst.getString(1), rst.getString(2),
                    rst.getString(3), rst.getString(4), rst.getString(5));
		clientes.add(cliente);
            }
	}
    }
    
}
