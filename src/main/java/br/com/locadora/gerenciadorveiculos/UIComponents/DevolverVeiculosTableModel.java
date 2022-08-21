/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.UIComponents;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucfg
 */
public class DevolverVeiculosTableModel extends AbstractTableModel{
    
    private final String[] colunas = {
        "Nome Cliente", "Placa", "Marca",
        "Modelo", "Ano", "Data Locação",
        "Preço Diária", "Dias Locado", "Valor Locação"
    };

    public DevolverVeiculosTableModel() {

    }
    
    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
