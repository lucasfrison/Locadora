package br.com.locadora.gerenciadorveiculos.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public static DataSource dataSource;

	public ConnectionFactory() {
            ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
            comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/locadora?useTimezone=true&serverTimezone=UTC");
            comboPooledDataSource.setUser("lucas");
            comboPooledDataSource.setPassword("challenger88516258");
            
            this.dataSource = comboPooledDataSource;
	}

	public Connection getConexao() {
            try {
                return this.dataSource.getConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
	}
}
