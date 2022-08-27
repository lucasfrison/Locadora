/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.controller;

import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import br.com.locadora.gerenciadorveiculos.service.VeiculoService;

/**
 *
 * @author lucfg
 */
public class VeiculoController {
    
    private VeiculoService veiculoService;
    
    public VeiculoController() {
        veiculoService = new VeiculoService();
    }
    
    public boolean adicionarVeiculo(Veiculo veiculo, String modelo) {
        boolean sucesso = veiculoService.adicionarVeiculo(veiculo, modelo);
        /*if (sucesso) {
            ClientesTableModel.listaClientes.add(cliente);
        }*/
        return sucesso;
    }
    
    
}
