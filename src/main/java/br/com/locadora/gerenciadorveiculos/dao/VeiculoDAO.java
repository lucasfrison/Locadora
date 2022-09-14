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
import br.com.locadora.gerenciadorveiculos.model.Locacao;
import br.com.locadora.gerenciadorveiculos.model.Marca;
import br.com.locadora.gerenciadorveiculos.model.ModeloAutomovel;
import br.com.locadora.gerenciadorveiculos.model.ModeloMotocicleta;
import br.com.locadora.gerenciadorveiculos.model.ModeloVan;
import br.com.locadora.gerenciadorveiculos.model.Motocicleta;
import br.com.locadora.gerenciadorveiculos.model.TipoVeiculo;
import br.com.locadora.gerenciadorveiculos.model.Van;
import br.com.locadora.gerenciadorveiculos.model.Veiculo;
import com.mchange.v2.c3p0.impl.C3P0Defaults;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author lucfg
 */
public class VeiculoDAO {
    
    private ConnectionFactory connectionFactory;

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
    
    public void alterarVeiculo(Veiculo veiculo) {
        try (Connection connection = connectionFactory.getConexao()) {
            try (PreparedStatement stm = connection
                .prepareStatement("UPDATE VEICULO V SET V.PLACA = ?, V.MARCA = ?, V.ESTADO = ?, V.CATEGORIA = ?, V.VALOR_COMPRA = ?, V.ANO = ? WHERE PLACA = ?")) {
                stm.setString(1, veiculo.getPlaca());
                stm.setString(2, veiculo.getMarca().toString());
                stm.setString(3, veiculo.getEstado().toString());
                stm.setString(4, veiculo.getCategoria().toString());
                stm.setDouble(5, veiculo.getValorCompra());
                stm.setInt(6, veiculo.getAno());
                stm.setString(7, veiculo.getPlaca());
                stm.execute();
            }    
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }

    public void locarVeiculo(Cliente cliente, Veiculo veiculo, Locacao locacao) {
        try (Connection connection = connectionFactory.getConexao()) {
            try (PreparedStatement stm = connection
                .prepareStatement("INSERT INTO LOCACAO (CPF, PLACA, DIAS, DATA_DEVOLUCAO, VALOR, ATIVO) "
                + "VALUES(?, ?, ?, ?, ?, TRUE)")) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                stm.setString(1, cliente.getCPF());
                stm.setString(2, veiculo.getPlaca());
                stm.setInt(3, locacao.getDias());
                stm.setString(4, sdf.format(locacao.getData().getTime()));
                stm.setDouble(5, locacao.getValor());
                stm.execute();
            }    
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    
    public void devolverVeiculo(Veiculo veiculo) {
        try (Connection connection = connectionFactory.getConexao()) {
            try (PreparedStatement stm = connection
                .prepareStatement("DELETE FROM LOCACAO WHERE PLACA = ?")) {
                stm.setString(1, veiculo.getPlaca());
                stm.execute();
            }    
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    
    public List<Veiculo> listarVeiculosDisponiveis() {
        List<Veiculo> veiculos = new ArrayList<>();
	try (Connection connection = connectionFactory.getConexao()){
            String sql = 
                    "SELECT PLACA, MARCA, MODELO, ANO, TIPO, VALOR_COMPRA, CATEGORIA FROM VEICULO WHERE ESTADO = 'DISPONIVEL'";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();
		popularListaVeiculos(veiculos, pstm);
            }
            
            return veiculos;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Veiculo> listarVeiculosAlugados() throws ParseException {
        List<Veiculo> veiculos = new ArrayList<>();
	try (Connection connection = connectionFactory.getConexao()){
            String sql = 
                    "SELECT C.NOME, C.CPF, V.TIPO, V.CATEGORIA, V.PLACA, V.MARCA, V.MODELO, V.ANO, L.DATA_DEVOLUCAO, L.VALOR, L.DIAS, "
                    + " V.VALOR_COMPRA FROM CLIENTE C, VEICULO V, LOCACAO L WHERE V.PLACA = L.PLACA AND C.CPF = L.CPF";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.execute();
		popularListaVeiculosLocados(veiculos, pstm);
            }
            
            return veiculos;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Veiculo> listarVeiculosComFiltro(String categoria, String tipo, String marca) {
        List<Veiculo> veiculos = new ArrayList<>();
	try (Connection connection = connectionFactory.getConexao()){
            String sql = 
                    "SELECT PLACA, MARCA, MODELO, ANO, TIPO, VALOR_COMPRA, CATEGORIA FROM VEICULO WHERE ESTADO = 'DISPONIVEL'"
                    + " AND CATEGORIA = ? AND TIPO = ? AND MARCA = ?";

            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setString(1, categoria);
                pstm.setString(2, tipo);
                pstm.setString(3, marca);
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
                Categoria categoria = Categoria.valueOf(rst.getString(7));
                
                if (tipo.equals("AUTOMOVEL")) {
                    ModeloAutomovel modeloAutomovel = ModeloAutomovel.valueOf(rst.getString(3));
                    veiculo = 
                        new Automovel(modeloAutomovel, marca, Estado.DISPONIVEL, null, categoria, rst.getDouble(6), rst.getString(1), rst.getInt(4));
                } else if (tipo.equals("MOTOCICLETA")){
                    ModeloMotocicleta modeloMotocicleta = ModeloMotocicleta.valueOf(rst.getString(3));
                    veiculo = 
                        new Motocicleta(modeloMotocicleta, marca, Estado.DISPONIVEL, null, categoria, rst.getDouble(6), rst.getString(1), rst.getInt(4));
                } else if (tipo.equals("VAN")) {
                    ModeloVan modeloVan = ModeloVan.valueOf(rst.getString(3));
                    veiculo = 
                        new Van(modeloVan, marca, Estado.DISPONIVEL, null, categoria, rst.getDouble(6), rst.getString(1), rst.getInt(4));
                }
                
                veiculos.add(veiculo);
            }
	}
    }
    
    private void popularListaVeiculosLocados(List<Veiculo> veiculos, PreparedStatement pstm) throws SQLException, ParseException {
	
        try (ResultSet rst = pstm.getResultSet()) {
            while (rst.next()) {
                
                Veiculo veiculo = null;
                Marca marca = Marca.valueOf(rst.getString(6));
                String tipo = rst.getString(3);
                Categoria categoria = Categoria.valueOf(rst.getString(4));
                Cliente cliente = new Cliente(rst.getString(1), "N/A", "N/A", rst.getString(2), "N/A");
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                cal.setTime(sdf.parse(rst.getString(9)));
                Locacao locacao = new Locacao(rst.getInt(11), rst.getDouble(10), cal, cliente);
                
                if (tipo.equals("AUTOMOVEL")) {
                    ModeloAutomovel modeloAutomovel = ModeloAutomovel.valueOf(rst.getString(7));
                    veiculo = 
                        new Automovel(modeloAutomovel, marca, Estado.LOCADO, locacao, categoria, rst.getDouble(12), rst.getString(5), rst.getInt(8));
                } else if (tipo.equals("MOTOCICLETA")){
                    ModeloMotocicleta modeloMotocicleta = ModeloMotocicleta.valueOf(rst.getString(7));
                    veiculo = 
                        new Motocicleta(modeloMotocicleta, marca, Estado.LOCADO, locacao, categoria, rst.getDouble(12), rst.getString(5), rst.getInt(8));
                } else if (tipo.equals("VAN")) {
                    ModeloVan modeloVan = ModeloVan.valueOf(rst.getString(7));
                    veiculo = 
                        new Van(modeloVan, marca, Estado.LOCADO, locacao, categoria, rst.getDouble(12), rst.getString(5), rst.getInt(8));
                }
                
                veiculos.add(veiculo);
            }
	}
    }
    
}
