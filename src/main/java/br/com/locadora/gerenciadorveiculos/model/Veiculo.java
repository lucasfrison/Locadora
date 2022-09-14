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
public abstract class Veiculo implements IVeiculo {

    private Marca marca;
    private Estado estado;
    private Locacao locacao;
    private Categoria categoria;
    private double valorDeCompra;
    private String placa;
    private int ano;

    public Veiculo(Marca marca, Estado estado, Locacao locacao, Categoria categoria, double valorDeCompra, String placa, int ano) {
        this.marca = marca;
        this.estado = estado;
        this.locacao = locacao;
        this.categoria = categoria;
        this.valorDeCompra = valorDeCompra;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public void locar(int dias, double valor, Calendar data, Cliente cliente) {
        estado = Estado.LOCADO;
        locacao = new Locacao(dias, valor, data, cliente);
    }

    @Override
    public void vender() {
        estado = Estado.VENDIDO;
    }

    @Override
    public void devolver() {
        locacao = null;
        estado = Estado.DISPONIVEL;
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
    public int getAno() {
        return ano;
    }

    @Override
    public abstract double getValorDiariaLocacao();

    @Override
    public double getValorCompra() {
        return valorDeCompra;
    }

    @Override
    public double getValorParaVenda() {
        int idade = Calendar.getInstance().get(Calendar.YEAR) - ano;
        double valorDeVenda = valorDeCompra - idade * 0.15 * valorDeCompra;
        if (valorDeVenda < valorDeCompra * 0.1) {
            valorDeVenda = valorDeCompra * 0.1;
        }
        return valorDeVenda;
    }
    
    public abstract Object getModelo();
    
}
