package com.bflor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bflor.model.Usuario;

public class UsuarioDAO {
    // CRUD -> Create, Read, Update, Delete;
    Connection connection = null;
    PreparedStatement preparador = null;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void criarUsuario(Usuario usuarioEntrada) {
        String sql = "INSERT INTO usuario (nome_completo, cpf, endereco, email, senha) VALUES (?, ?, ?, ?, ?)";

        try {
            preparador = connection.prepareStatement(sql);

            preparador.setString(1, usuarioEntrada.getNomeCompleto());
            preparador.setString(2, usuarioEntrada.getCpf());
            preparador.setString(3, usuarioEntrada.getEndereco());
            preparador.setString(4, usuarioEntrada.getEmail());
            preparador.setString(5, usuarioEntrada.getSenha());
            preparador.execute();

        } catch (SQLException e) {
            System.out.println("Deu um erro no cadastro!!\n\n" + e);
        } finally {
            closeResources();
        }
    }

    public Usuario readUsuario(int id) {
        String sql = "SELECT * FROM usuario WHERE idUsuario = ?";
        Usuario usuario = null;

        try (PreparedStatement preparador = connection.prepareStatement(sql)) {
            preparador.setInt(1, id);
            try (ResultSet resultSet = preparador.executeQuery()) {
                if (resultSet.next()) {
                    usuario = new Usuario();
                    usuario.setIdUsuario(resultSet.getInt("idUsuario"));
                    usuario.setNomeCompleto(resultSet.getString("nome_completo"));
                    usuario.setCpf(resultSet.getString("cpf"));
                    usuario.setEndereco(resultSet.getString("endereco"));
                    usuario.setEmail(resultSet.getString("email"));
                    usuario.setSenha(resultSet.getString("senha"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar usuário: " + e.getMessage());
        }

        return usuario;
    }

    public void updateUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET nome_completo=?, cpf=?, endereco=?, email=?, senha=? WHERE idUsuario=?";

        try {
            preparador = connection.prepareStatement(sql);

            preparador.setString(1, usuario.getNomeCompleto());
            preparador.setString(2, usuario.getCpf());
            preparador.setString(3, usuario.getEndereco());
            preparador.setString(4, usuario.getEmail());
            preparador.setString(5, usuario.getSenha());
            preparador.setInt(6, usuario.getIdUsuario());

            preparador.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        } finally {
            closeResources();
        }
    }

    public void deleteUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE idUsuario=?";

        try {
            preparador = connection.prepareStatement(sql);
            preparador.setInt(1, id);

            preparador.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir usuário: " + e.getMessage());
        } finally {
            closeResources();
        }
    }

    private void closeResources() {
        try {
            if (preparador != null) {
                preparador.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

