/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.dao;

import br.com.locadora.gerenciadorveiculos.factory.ConnectionFactory;
import br.com.locadora.gerenciadorveiculos.model.Cliente;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lucfg
 */
public class VeiculoDAO {
    
    ConnectionFactory connectionFactory;

    public VeiculoDAO() {
        connectionFactory = new ConnectionFactory();
    }

    public void adicionarVeiculo(Veiculo veiculo, String modelo) {
        try (Connection connection = connectionFactory.getConexao()){
            String sql = 
                    "INSERT INTO VEICULO (PLACA, MARCA, ESTADO, CATEGORIA, MODELO, VALOR_COMPRA, ANO) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, veiculo.getPlaca());
		pstm.setString(2, veiculo.getMarca().toString());
                pstm.setString(3, veiculo.getEstado().toString());
                pstm.setString(4, veiculo.getCategoria().toString());
                pstm.setString(5, modelo);
                pstm.setDouble(6, veiculo.getValorCompra());
                pstm.setInt(7, veiculo.getAno());
                pstm.execute();
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
