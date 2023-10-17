package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.Usuario;

public class UsuarioDAO {
	//CRUD -> Create, Read, Update, Delete;
	
		public UsuarioDAO(Object connection) {
		// TODO Auto-generated constructor stub
	}

		public void criarUsuario(Usuario usuarioEntrada) {
			String sql = "INSERT INTO usuario (Login, Senha, HistoricoViagens) VALUES (?, ?, ?)";
		
			
			try { 
				Statement Conexao = null;
				PreparedStatement preparador = Conexao.getConnection().prepareStatement(sql);
				
				preparador.setString(1, usuarioEntrada.getLogin());
				preparador.setString(2, usuarioEntrada.getSenha());
				preparador.setString(3, usuarioEntrada.getHistoricoViagens());
				
				preparador.execute();
				
				preparador.close();
			
			} catch (SQLException e) {
				System.out.println("Deu um erro no cadastro!!\n\n"+e);
			}
		}

		public void createUsuario(Usuario usuario) {
			// TODO Auto-generated method stub
			
		}

		public Usuario readUsuario(int i) {
			// TODO Auto-generated method stub
			return null;
		}

		public void updateUsuario(Usuario usuario) {
			// TODO Auto-generated method stub
			
		}

		public void deleteUsuario(int i) {
			// TODO Auto-generated method stub
			
		}	



}
