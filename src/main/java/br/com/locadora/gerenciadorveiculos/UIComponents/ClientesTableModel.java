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
    
    private String[][] linhas = {
        {"a","b","c","d","e"},
        {"f","g","h","i","j"}
    }; 

    public ClientesTableModel() {

    }
    
    @Override
    public int getRowCount() {
        return linhas.length;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return linhas[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
    
