/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.uicomponents;

import br.com.locadora.gerenciadorveiculos.model.Marca;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucfg
 */
public class DevolverVeiculosTableModel extends AbstractTableModel{
    
    public static List<Veiculo> listaDeVeiculos;
    
    private final String[] colunas = {
        "Nome Cliente", "Placa", "Marca",
        "Modelo", "Ano", "Data Locação",
        "Preço Diária", "Dias Locado", "Valor Locação"
    };

    public DevolverVeiculosTableModel(List<Veiculo> veiculos) {
        listaDeVeiculos = veiculos;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo veiculo = listaDeVeiculos.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return veiculo.getLocacao().getCliente().getNome();
            case 1:
                return veiculo.getPlaca();
            case 2:
                return veiculo.getMarca();
            case 3:
                return veiculo.getModelo();
            case 4:
                return veiculo.getAno();
            case 5: 
                Date date = veiculo.getLocacao().getData().getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                return sdf.format(date);
            case 6:
                return "R$ " + String.format("%.2f",veiculo.getValorDiariaLocacao());
            case 7:
                return veiculo.getLocacao().getDias();
            case 8: 
                return "R$ " + String.format("%.2f",veiculo.getLocacao().getValor());
        }
        return null;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0 : return String.class;
            case 1 : return String.class;
            case 2 : return Marca.class;
            case 3 : return Object.class;
            case 4 : return Integer.class;
            case 5 : return SimpleDateFormat.class;
            case 6 : return String.class;
            case 7 : return String.class;
            case 8 : return String.class;
        }
        return null;
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
        return colunas[column]; 
    }
    
    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
    
}
