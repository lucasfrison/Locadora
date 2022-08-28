/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.controller;

import br.com.locadora.gerenciadorveiculos.model.TipoVeiculo;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import br.com.locadora.gerenciadorveiculos.service.VeiculoService;
import java.util.List;

/**
 *
 * @author lucfg
 */
public class VeiculoController {
    
    private VeiculoService veiculoService;
    
    public VeiculoController() {
        veiculoService = new VeiculoService();
    }
    
    public boolean adicionarVeiculo(Veiculo veiculo, String modelo, String tipo) {
        boolean sucesso = veiculoService.adicionarVeiculo(veiculo, modelo, tipo);
        return sucesso;
    }
    
    public List<Veiculo> listarVeiculosDisponiveis() {
        return veiculoService.listarVeiculosDisponiveis();
    }
}
