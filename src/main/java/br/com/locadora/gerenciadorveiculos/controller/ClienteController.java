/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.controller;

import br.com.locadora.gerenciadorveiculos.model.Cliente;
import br.com.locadora.gerenciadorveiculos.service.ClienteService;

/**
 *
 * @author lucfg
 */
public class ClienteController {
     
    private ClienteService clienteService = new ClienteService();
    
    public boolean adicionarCliente(Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }
    
}
