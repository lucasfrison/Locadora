package br.com.locadora.gerenciadorveiculos.uicomponents;

import br.com.locadora.gerenciadorveiculos.model.Marca;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucfg
 */
public class VenderVeiculosTableModel extends AbstractTableModel{
    
    public static List<Veiculo> listaVeiculos;
    
    private final String[] colunas = {
        "Placa", "Marca", "Modelo", "Ano", "Valor de Venda"
    };

    public VenderVeiculosTableModel(List<Veiculo> listaDeVeiculos) {
        listaVeiculos = listaDeVeiculos;
    }
    
    @Override
    public int getRowCount() {
        return listaVeiculos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo veiculo = listaVeiculos.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return veiculo.getPlaca();
            case 1:
                return veiculo.getMarca();
            case 2:
                return veiculo.getModelo();
            case 3:
                return veiculo.getAno();
            case 4:
                return "R$ " + Double.toString(veiculo.getValorParaVenda()); 
        }
        return null;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0 : return String.class;
            case 1 : return Marca.class;
            case 2 : return Object.class;
            case 3 : return Integer.class;
            case 4 : return String.class;
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }

    
    
    
}

