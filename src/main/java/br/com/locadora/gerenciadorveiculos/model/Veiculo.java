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
        return estado;    
    }

    @Override
    public Marca getMarca() {
        return marca;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public Locacao getLocacao() {
        return locacao;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public Integer getAno() {
        return ano;
    }

    @Override
    public double getValorDiariaLocacao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getValorCompra() {
        return valorDeCompra;
    }
    
}
