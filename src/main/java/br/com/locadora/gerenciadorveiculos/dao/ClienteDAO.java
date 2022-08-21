/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.dao;

import br.com.locadora.gerenciadorveiculos.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lucfg
 */
public class ClienteDAO {
    private Connection connection;

    public ClienteDAO(Connection connection) {
	this.connection = connection;
    }

    public void adicionarCliente(Cliente cliente) {
        try {
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
}
