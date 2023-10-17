package com.beijaflorturismo;
 
import java.util.Scanner;

import dao.UsuarioDAO;
import database.DatabaseConnection;
import model.Usuario;

 
public class Main {
    private static final String UsuarioConsultado = null;
	private static final String Login = null;
	private static final String Senha = null;
	private static final String HistoricoViagens = null;

	public static void main(String[] args) {
        var connection = DatabaseConnection.createConnection();
        UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
        Scanner scanner = new Scanner(System.in);
 
        int escolha;
        do {
            System.out.println("Bem-vindos à Beija Flor Turismo!");
            System.out.println("1. Novo Cadastro de Usuário");
            System.out.println("2. Consultar Usuário");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Deletar Usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();
 
            switch (escolha) {
                case 1:
                    System.out.println("Novo Cadastro de Usuário");
                    Usuario novoUsuario = lerDadosUsuario(scanner);
                    usuarioDAO.createUsuario(novoUsuario);
                    break;
                case 2:
                    System.out.println("Consultar Usuário");
                    System.out.print("Informe o ID do Usuário: ");
                    int idConsulta = scanner.nextInt();
                    Usuario usuarioConsultado = usuarioDAO.readUsuario(idConsulta);
                    if (usuarioConsultado != null) {
                        System.out.println("Usuário encontrado: " + UsuarioConsultado);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Atualizar Usuario");
                    System.out.print("Informe o ID do Usuário a ser atualizado: ");
                    int idAtualizacao = scanner.nextInt();
                    Usuario usuarioAtualizar = usuarioDAO.readUsuario(idAtualizacao);
                    if (usuarioAtualizar != null) {
                        Usuario dadosAtualizados = lerDadosUsuario(scanner);
                        dadosAtualizados.setidUsuario(idAtualizacao);
                        usuarioDAO.updateUsuario(dadosAtualizados);
                        System.out.println("Usuário atualizado com sucesso.");
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Deletar Usuário");
                    System.out.print("Informe o ID do usuário a ser excluído: ");
                    int idExclusao = scanner.nextInt();
                    Usuario usuarioExcluir = usuarioDAO.readUsuario(idExclusao);
                    if (usuarioExcluir != null) {
                    	usuarioDAO.deleteUsuario(idExclusao);
                        System.out.println("Usuário excluído com sucesso.");
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
 
        DatabaseConnection.closeConnection(connection);
        scanner.close();
    }
 
    private static Usuario lerDadosUsuario(Scanner scanner) {
        System.out.print("Login: ");
        String Login = scanner.nextLine();
        System.out.print("Senha: ");
        String Senha = scanner.nextLine();
        System.out.print("Historico de Viagens: ");
        String HistoricoViagens = scanner.nextLine();

 
        return new Usuario(Login, Senha, HistoricoViagens);
    }

	public static String getLogin() {
		return Login;
	}

	public static String getSenha() {
		return Senha;
	}

	public static String getHistoricoviagens() {
		return HistoricoViagens;
	}
}