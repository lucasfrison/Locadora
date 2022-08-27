/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.model;

import java.util.Calendar;

/**
 *
 * @author lucfg
 */
public interface IVeiculo {
    
    //Muda estado para LOCADO. Cria uma instância de Locacao e armazena no atributo locacao. Chama o método getValorDiariaLocacao para calcular o valor da locação.
    public void locar(Integer dias, Calendar data, Cliente cliente);
    //Muda estado para VENDIDO e não pode mais ser alugado
    public void vender();
    //Muda estado para DISPONIVEL
    public void devolver();
    public Estado getEstado();
    public Marca getMarca();
    public Categoria getCategoria();
    public Locacao getLocacao();
    public String getPlaca();
    public Integer getAno();
    //Método que calcula um valor para venda. Utilizar o seguinte cálculo://valorParaVenda = valorDeCompra –idadeVeiculoEmAnos*0,15*valorDeCompra//Se o resultado for menor do que 10% do valorDeCompra ou negative, então//        varlorParaVenda = valorDeCompra*0,1public double getValorParaVenda();//Método que será abstrato na classe Veiculo
    public double getValorDiariaLocacao();
    public double getValorCompra();
    
}
