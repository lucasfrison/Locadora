/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.dao;

import br.com.locadora.gerenciadorveiculos.factory.ConnectionFactory;
import br.com.locadora.gerenciadorveiculos.model.Automovel;
import br.com.locadora.gerenciadorveiculos.model.Categoria;
import br.com.locadora.gerenciadorveiculos.model.Cliente;
import br.com.locadora.gerenciadorveiculos.model.Estado;
import br.com.locadora.gerenciadorveiculos.model.Marca;
import br.com.locadora.gerenciadorveiculos.model.ModeloAutomovel;
import br.com.locadora.gerenciadorveiculos.model.ModeloMotocicleta;
import br.com.locadora.gerenciadorveiculos.model.ModeloVan;
import br.com.locadora.gerenciadorveiculos.model.Motocicleta;
import br.com.locadora.gerenciadorveiculos.model.TipoVeiculo;
import br.com.locadora.gerenciadorveiculos.model.Van;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucfg
 */
public class VeiculoDAO {
    
    ConnectionFactory connectionFactory;

    public VeiculoDAO() {
        connectionFactory = new ConnectionFactory();
    }

    public void adicionarVeiculo(Veiculo veiculo, String modelo, String tipo) {
        try (Connection connection = connectionFactory.getConexao()){
            String sql = 
                    "INSERT INTO VEICULO (PLACA, MARCA, ESTADO, CATEGORIA, MODELO, VALOR_COMPRA, ANO, TIPO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, veiculo.getPlaca());
		pstm.setString(2, veiculo.getMarca().toString());
                pstm.setString(3, veiculo.getEstado().toString());
                pstm.setString(4, veiculo.getCategoria().toString());
                pstm.setString(5, modelo);
                pstm.setDouble(6, veiculo.getValorCompra());
                pstm.setInt(7, veiculo.getAno());
                pstm.setString(8, tipo);
                pstm.execute();
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Veiculo> listarVeiculosDisponiveis() {
        List<Veiculo> veiculos = new ArrayList<>();
	try (Connection connection = connectionFactory.getConexao()){
            String sql = 
                    "SELECT PLACA, MARCA, MODELO, ANO, TIPO, VALOR_COMPRA FROM VEICULO WHERE ESTADO = 'DISPONIVEL'";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();
		popularListaVeiculos(veiculos, pstm);
            }
            
            return veiculos;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    private void popularListaVeiculos(List<Veiculo> veiculos, PreparedStatement pstm) throws SQLException {
	
        try (ResultSet rst = pstm.getResultSet()) {
            while (rst.next()) {
                
                Veiculo veiculo = null;
                Marca marca = Marca.valueOf(rst.getString(2));
                String tipo = rst.getString(5);
                
                if (tipo.equals("AUTOMOVEL")) {
                    ModeloAutomovel modeloAutomovel = ModeloAutomovel.valueOf(rst.getString(3));
                    veiculo = 
                        new Automovel(modeloAutomovel, marca, Estado.DISPONIVEL, null, null, rst.getDouble(6), rst.getString(1), rst.getInt(4));
                } if (tipo.equals("MOTOCICLETA")){
                    ModeloMotocicleta modeloMotocicleta = ModeloMotocicleta.valueOf(rst.getString(3));
                    veiculo = 
                        new Motocicleta(modeloMotocicleta, marca, Estado.DISPONIVEL, null, null, rst.getDouble(6), rst.getString(1), rst.getInt(4));
                } if (tipo.equals("VAN")) {
                    ModeloVan modeloVan = ModeloVan.valueOf(rst.getString(3));
                    veiculo = 
                        new Van(modeloVan, marca, Estado.DISPONIVEL, null, null, rst.getDouble(6), rst.getString(1), rst.getInt(4));
                }
                
                veiculos.add(veiculo);
            }
	}
    }
    
}
