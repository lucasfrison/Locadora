/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.service;

import br.com.locadora.gerenciadorveiculos.dao.VeiculoDAO;
import br.com.locadora.gerenciadorveiculos.model.Cliente;
import br.com.locadora.gerenciadorveiculos.model.Locacao;
import br.com.locadora.gerenciadorveiculos.model.TipoVeiculo;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author lucfg
 */
public class VeiculoService {
       
    private VeiculoDAO veiculoDAO;
    
    public VeiculoService() {
        veiculoDAO = new VeiculoDAO();
    }
    
    public boolean adicionarVeiculo(Veiculo veiculo, String modelo, String tipo) {
        
        if (!validarVeiculo(veiculo)) return false;
        try {
            veiculoDAO.adicionarVeiculo(veiculo, modelo, tipo);
            return true;
        } catch(Exception e) {
            return false;
        }    
    }
    
    public boolean alterarVeiculo(Veiculo veiculo) {
        if (!validarVeiculo(veiculo)) return false;
        try {
            veiculoDAO.alterarVeiculo(veiculo);
            return true;
        } catch(Exception e) {
            return false;
        } 
    }

    private boolean validarVeiculo(Veiculo veiculo) {
        
        boolean veiculoValido = (veiculo.getAno() > 1950 && veiculo.getPlaca() != null
            && veiculo.getValorCompra() > 3000);
        
        return veiculoValido;
    }
    
    private boolean validarLocacao(Veiculo veiculo) {
        
        String cpf = veiculo.getLocacao().getCliente().getCPF();
               
        int cpfInvalido = cpf.indexOf(' ');
        
        if (cpfInvalido != -1) cpf = null;
        
        boolean locacaoValida = (cpf != null && veiculo.getLocacao().getDias() > 0);
        
        return locacaoValida;
    }

    public List<Veiculo> listarVeiculosDisponiveis() {
        return veiculoDAO.listarVeiculosDisponiveis();
    }
    
    public List<Veiculo> listarVeiculosComFiltro(String categoria, String tipo, String marca) {
        return veiculoDAO.listarVeiculosComFiltro(categoria, tipo, marca);
    }
    
    public List<Veiculo> listarVeiculosAlugados() throws ParseException {
        return veiculoDAO.listarVeiculosAlugados();
    }
    
    public boolean locarVeiculo(Cliente cliente, Veiculo veiculo, Locacao locacao) {
        if (!validarLocacao(veiculo)) return false;
        try {
            veiculoDAO.locarVeiculo(cliente, veiculo, locacao);
            return true;
        } catch(Exception e) {
            return false;
        } 
    }
    
    public boolean devolverVeiculo(Veiculo veiculo) {
        try {
            veiculoDAO.devolverVeiculo(veiculo);
            return true;
        } catch(Exception e) {
            return false;
        } 
    }
}
