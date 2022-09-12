/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.controller;

import br.com.locadora.gerenciadorveiculos.model.Cliente;
import br.com.locadora.gerenciadorveiculos.model.Locacao;
import br.com.locadora.gerenciadorveiculos.model.TipoVeiculo;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import br.com.locadora.gerenciadorveiculos.service.VeiculoService;
import java.text.ParseException;
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
    
    public boolean venderVeiculo(Veiculo veiculo) {
        veiculo.vender();
        return veiculoService.alterarVeiculo(veiculo);
    }
    
    public List<Veiculo> listarVeiculosComFiltro(String categoria, String tipo, String marca) {
        return veiculoService.listarVeiculosComFiltro(categoria, tipo, marca);
    }
    
    public boolean locarVeiculo(Cliente cliente, Veiculo veiculo, Locacao locacao) {
        veiculo.locar(locacao.getDias(), locacao.getValor(), locacao.getData(), locacao.getCliente());
        return (veiculoService.locarVeiculo(cliente, veiculo, locacao) && veiculoService.alterarVeiculo(veiculo));
    }
    
    public List<Veiculo> listarVeiculosAlugados() throws ParseException {
        return veiculoService.listarVeiculosAlugados();
    }
    
    public boolean devolverVeiculo(Veiculo veiculo) {
        veiculo.devolver();
        veiculoService.alterarVeiculo(veiculo);
        return veiculoService.devolverVeiculo(veiculo);
    }
    
}
