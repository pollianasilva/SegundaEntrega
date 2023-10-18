package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static Connection connection;

    

    public static Connection getConnection() {
    	
        try {
            if (connection == null) {
            	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beijaflorturismo", "root", "root");
                return connection;
            } else {
                return connection;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    	
    	



	public static Object createConnection() {
		// TODO Auto-generated method stub
		return null;
	}



	public static void closeConnection(Object connection2) {
		// TODO Auto-generated method stub
		
	}
	
//	private static final String ="jdbc:mysql://localhost:3306/beijaFlorTurismo";
//	private static final String user="root";
//	private static final String password="root";
//	
//	public static Connection createConnection() {
//try {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	System.out.println("Driver Encontrado!");
//	}catch(ClassNotFoundException e) {
//		System.out.println("Driver não encontrado! Mensagem: " + e.getLocalizedMessage());
//
//
//	}
//try {
//	Connection connection = DriverManager.getConnection(url, user, password);
//	System.out.println("Conectado com sucesso!");
//	
//	return connection;
//}catch(SQLException e) {
//	System.out.println("Não foi possivel conectar ao Banco! Mensagem: " + e.getMessage());
//	return null;
//}
//	
//	
//}
}

