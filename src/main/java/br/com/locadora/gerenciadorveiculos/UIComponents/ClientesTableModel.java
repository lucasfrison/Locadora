package br.com.locadora.gerenciadorveiculos.UIComponents;

import br.com.locadora.gerenciadorveiculos.model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucfg
 */
public class ClientesTableModel extends AbstractTableModel{
    
    private final String[] colunas = {
        "Nome", "Sobrenome", "RG", "CPF", "Endereço"
    };
    
    private String[][] linhas;

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
        return linhas[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }

    
    
}
    
