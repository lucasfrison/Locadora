package br.com.locadora.gerenciadorveiculos.components;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucfg
 */
public class VenderVeiculosTableModel extends AbstractTableModel{
    
    private final String[] colunas = {
        "Placa", "Marca", "Modelo", "Ano", "Valor de Venda"
    };

    public VenderVeiculosTableModel() {

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

