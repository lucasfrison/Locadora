/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.model;

/**
 *
 * @author lucfg
 */
public class Motocicleta extends Veiculo {
    
    final private ModeloMotocicleta modelo;

    public Motocicleta(ModeloMotocicleta modelo, Marca marca, Estado estado, 
            Locacao locacao, Categoria categoria, Double valorDeCompra, 
            String placa, Integer ano) {
        super(marca, estado, locacao, categoria, valorDeCompra, placa, ano);
        this.modelo = modelo;
    }
    
    public ModeloMotocicleta getModelo() {
        return modelo;
    }
    
    @Override
    public double getValorDiariaLocacao() {
        return 0.0;
    }
    
}
