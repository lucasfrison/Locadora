/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.factory;

import br.com.locadora.gerenciadorveiculos.dao.ClienteDAO;
import java.sql.Connection;

/**
 *
 * @author lucfg
 */
public class ClienteDAOFactory {
    
    private ConnectionFactory connectionFactory;
    private Connection connection;
    private ClienteDAO clienteDAO;

    public ClienteDAOFactory() {
        connectionFactory = new ConnectionFactory();
        connection = connectionFactory.getConexao();
        clienteDAO = new ClienteDAO(connection);
    }
    
    public ClienteDAO getDAO() {
        return clienteDAO; 
    }

}
