/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.controller;

import br.com.locadora.gerenciadorveiculos.uicomponents.ClientesTableModel;
import br.com.locadora.gerenciadorveiculos.model.Cliente;
import br.com.locadora.gerenciadorveiculos.service.ClienteService;
import java.util.List;

/**
 *
 * @author lucfg
 */
public class ClienteController {
     
    private ClienteService clienteService;
    
    public ClienteController() {
        clienteService = new ClienteService();
    }
    
    public boolean adicionarCliente(Cliente cliente) {
        boolean sucesso = clienteService.adicionarCliente(cliente);
        if (sucesso) {
            ClientesTableModel.listaClientes.add(cliente);
        }
        return sucesso;
    }
    
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }
   
    public boolean removerCliente(Cliente cliente) {
        ClientesTableModel.listaClientes.remove(cliente);
        return clienteService.removerCliente(cliente);
    }
    
    public boolean alterarCliente(Cliente cliente) {
        boolean sucesso = clienteService.alterarCliente(cliente);
        if (sucesso) {
            ClientesTableModel.listaClientes.add(cliente);
        }
        return sucesso;
    }
}
