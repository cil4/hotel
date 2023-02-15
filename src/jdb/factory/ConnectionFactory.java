package jdb.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;
	

	public ConnectionFactory() {

	    Properties prop = new Properties();
	    InputStream input = null;
	    
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		
		try {
			input = new FileInputStream(".dbconfig.properties");
			prop.load(input);

			comboPooledDataSource.setJdbcUrl(prop.getProperty("db.url"));
			comboPooledDataSource.setUser(prop.getProperty("db.username"));
			comboPooledDataSource.setPassword(prop.getProperty("db.password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		this.dataSource = comboPooledDataSource;
	}

	public Connection recuperarConexion() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
