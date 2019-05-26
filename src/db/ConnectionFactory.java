package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.DriverManager;;

public class ConnectionFactory {

	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static final String DATABASE = "Empresa";

	private static ConnectionFactory instance = new ConnectionFactory();
	
	private static final Logger LOGGER = Logger.getLogger(ConnectionFactory.class.getName());

	private ConnectionFactory() {

	}

	private Connection createConnection() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE, USER, PASSWORD);
		} catch (SQLException e) {
			LOGGER.severe("an error ocurred while creating connection with database. " + e);
		}
		return conn;
	}

	public static Connection getConnection() {
		LOGGER.info("creating connection with database");
		return instance.createConnection();
	}

}
