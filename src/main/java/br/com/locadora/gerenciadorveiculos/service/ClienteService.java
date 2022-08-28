/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.service;

import br.com.locadora.gerenciadorveiculos.dao.ClienteDAO;
import br.com.locadora.gerenciadorveiculos.factory.ConnectionFactory;
import br.com.locadora.gerenciadorveiculos.model.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lucfg
 */
public class ClienteService {
    
    private ClienteDAO clienteDAO;
    
    public ClienteService() {
        clienteDAO = new ClienteDAO();
    }
    
    public boolean adicionarCliente(Cliente cliente) {
        
        if (!validarCliente(cliente)) return false;
        try {
            clienteDAO.adicionarCliente(cliente);
            return true;
        } catch(Exception e) {
            return false;
        }    
    }
    
    public List<Cliente> listarClientes() {
        return clienteDAO.listarClientes();
    }
    
    public boolean removerCliente(Cliente cliente) {
        //adicionar validação de veículos alugados
        try {
            clienteDAO.removerCliente(cliente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean alterarCliente(Cliente cliente) {
        if (!validarCliente(cliente)) return false;
        try {
            clienteDAO.alterarCliente(cliente);
            return true;
        } catch(Exception e) {
            return false;
        } 
    }
    
    private boolean validarCliente(Cliente cliente) {
        
        String cpf = cliente.getCPF();
        String rg = cliente.getRG();
        
        int cpfInvalido = cpf.indexOf(' ');
        int rgInvalido = rg.indexOf(' ');
        
        if (cpfInvalido != -1) cpf = null;
        if (rgInvalido != -1) rg = null;
        
        boolean clienteValido = (!cliente.getNome().equals("") && rg != null
                && cpf != null && !cliente.getEndereco().equals(""));
        
        return clienteValido;
    }
    
}
