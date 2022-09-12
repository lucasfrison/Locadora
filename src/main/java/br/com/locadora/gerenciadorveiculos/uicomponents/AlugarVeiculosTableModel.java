package br.com.locadora.gerenciadorveiculos.uicomponents;

import br.com.locadora.gerenciadorveiculos.model.Marca;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucfg
 */
public class AlugarVeiculosTableModel extends AbstractTableModel{
    
    public static List<Veiculo> listaDeVeiculos;
    
    private final String[] colunas = {
        "Placa", "Marca", "Modelo", "Ano", "Valor da Diária"
    };

    public AlugarVeiculosTableModel(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }
    
    @Override
    public int getRowCount() {
        return listaDeVeiculos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo veiculo = listaDeVeiculos.get(rowIndex);
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
                return "R$ " + String.format("%.2f", veiculo.getValorDiariaLocacao()); 
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
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
    
}
    