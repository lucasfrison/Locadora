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
                pstm.setString(1, "TESTE");
		pstm.setString(2, "DA SILVA");
                pstm.setInt(3, 132552000);
                pstm.setLong(4, 10659466945L);
                pstm.setString(5, "RUA WALFRIDO FERREIRA DE ANDRADE");
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
