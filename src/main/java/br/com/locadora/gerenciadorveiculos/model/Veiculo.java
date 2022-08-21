/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.model;

import java.util.Calendar;

/**
 *
 * @author lucfg
 */
public class Veiculo implements IVeiculo {

    final private Marca marca;
    private Estado estado;
    private Locacao locacao;
    final private Categoria categoria;
    private Double valorDeCompra;
    final private String placa;
    final private Integer ano;

    public Veiculo(Marca marca, Estado estado, Locacao locacao, Categoria categoria, Double valorDeCompra, String placa, Integer ano) {
        this.marca = marca;
        this.estado = estado;
        this.locacao = locacao;
        this.categoria = categoria;
        this.valorDeCompra = valorDeCompra;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public void locar(Integer dias, Calendar data, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void vender() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Estado getEstado() {
        throw new UnsupportedOperationException("Not supported yet.");    
    }

    @Override
    public Marca getMarca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Categoria getCategoria() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Locacao getLocacao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getPlaca() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getAno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getValorDiariaLocacao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
