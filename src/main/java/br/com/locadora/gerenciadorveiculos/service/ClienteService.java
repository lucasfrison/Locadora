/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.service;

import br.com.locadora.gerenciadorveiculos.dao.ClienteDAO;
import br.com.locadora.gerenciadorveiculos.factory.ConnectionFactory;
import br.com.locadora.gerenciadorveiculos.model.Cliente;
import java.sql.Connection;

/**
 *
 * @author lucfg
 */
public class ClienteService {
    
    private ConnectionFactory connectionFactory = new ConnectionFactory();
    private Connection connection = connectionFactory.getConexao();
    private ClienteDAO clienteDAO = new ClienteDAO(connection);
    
    public boolean adicionarCliente(Cliente cliente) {
        
        if (!validarCliente(cliente)) return false;
        
        clienteDAO.adicionarCliente(cliente);
        return true;
    }
    
    private boolean validarCliente(Cliente cliente) {
        
        String cpf = cliente.getCPF();
        String rg = cliente.getRG();
        
        int cpfInvalido = cpf.indexOf(' ');
        int rgInvalido = rg.indexOf(' ');
        
        if (cpfInvalido != -1) cpf = null;
        if (rgInvalido != -1) rg = null;
        
        boolean clienteInvalido = (cliente.getNome().equals("") || rg == null
                || cpf == null || cliente.getEndereco().equals(""));
        
        if (clienteInvalido) return false;
        return true;
    }
    
}
