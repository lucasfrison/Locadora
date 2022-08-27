package br.com.locadora.gerenciadorveiculos.uicomponents;

import br.com.locadora.gerenciadorveiculos.controller.ClienteController;
import br.com.locadora.gerenciadorveiculos.model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucfg
 */
public class ClientesTableModel extends AbstractTableModel{
    
    private final String[] colunas = {
        "Nome", "Sobrenome", "CPF", "RG", "Endereço"
    };
    
    public static List<Cliente> listaClientes;
    
    public ClientesTableModel(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = listaClientes.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return cliente.getNome();
            case 1:
                return cliente.getSobrenome();
            case 2:
                return cliente.getCPF();
            case 3:
                return cliente.getRG();
            case 4:
                return cliente.getEndereco(); 
           }
           return null;
   }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    } 
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void fireTableRowsDeleted(int firstRow, int lastRow) {
        super.fireTableRowsDeleted(firstRow, lastRow);
    }

    @Override
    public void fireTableCellUpdated(int row, int column) {
        super.fireTableCellUpdated(row, column);
    }
    
    
    
}
    
