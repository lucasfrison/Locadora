/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.factory;

import br.com.locadora.gerenciadorveiculos.dao.ClienteDAO;
import br.com.locadora.gerenciadorveiculos.dao.VeiculoDAO;
import java.sql.Connection;

/**
 *
 * @author lucfg
 */
public class VeiculoDAOFactory {
    
    private ConnectionFactory connectionFactory;
    private Connection connection;
    private VeiculoDAO veiculoDAO;

    public VeiculoDAOFactory() {
        connectionFactory = new ConnectionFactory();
        connection = connectionFactory.getConexao();
        veiculoDAO = new VeiculoDAO(connection);
    }
    
    public VeiculoDAO getDAO() {
        return veiculoDAO; 
    }
    
}
