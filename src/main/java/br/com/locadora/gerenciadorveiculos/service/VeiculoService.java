/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.service;

import br.com.locadora.gerenciadorveiculos.dao.VeiculoDAO;
import br.com.locadora.gerenciadorveiculos.factory.VeiculoDAOFactory;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;

/**
 *
 * @author lucfg
 */
public class VeiculoService {
       
    private VeiculoDAOFactory veiculoDAOFactory;
    private VeiculoDAO veiculoDAO;
    
    public VeiculoService() {
        veiculoDAOFactory = new VeiculoDAOFactory();
        veiculoDAO = veiculoDAOFactory.getDAO();
    }
    
    public boolean adicionarVeiculo(Veiculo veiculo, String modelo) {
        
        if (!validarVeiculo(veiculo)) return false;
        try {
            veiculoDAO.adicionarVeiculo(veiculo, modelo);
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
}
