package br.com.locadora.gerenciadorveiculos.UIComponents;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucfg
 */
public class ClientesTableModel extends AbstractTableModel{
    
    private final String[] colunas = {
        "Nome", "Sobrenome", "RG", "CPF", "Endereço"
    };

    public ClientesTableModel() {

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
    
