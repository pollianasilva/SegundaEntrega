package com.bflor;

import java.util.Scanner;
import com.bflor.dao.UsuarioDAO;
import com.bflor.database.DatabaseConnection;
import com.bflor.model.Usuario;

public class Main {

    public static void main(String[] args) {
        var connection = DatabaseConnection.getConnection();
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
                    Usuario novoUsuario = new Usuario();

                    do {
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        if (!cpf.trim().isEmpty()) {
                            novoUsuario.setCpf(cpf);
                            break;
                        } else {
                            System.out.println("O CPF não pode estar vazio. Tente novamente.");
                        }
                    } while (true);

                    do {
                        System.out.print("Nome Completo: ");
                        String nomeCompleto = scanner.nextLine();
                        if (!nomeCompleto.trim().isEmpty()) {
                            novoUsuario.setNomeCompleto(nomeCompleto);
                            break;
                        } else {
                            System.out.println("O nome completo não pode estar vazio. Tente novamente.");
                        }
                    } while (true);

                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    novoUsuario.setEndereco(endereco);

                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    novoUsuario.setEmail(email);

                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    novoUsuario.setSenha(senha);

                    usuarioDAO.criarUsuario(novoUsuario);
                    break;
                case 2:
                    System.out.println("Consultar Usuário");
                    System.out.print("Informe o ID do Usuário: ");
                    int idConsulta = scanner.nextInt();
                    Usuario usuarioConsultado = usuarioDAO.readUsuario(idConsulta);
                    if (usuarioConsultado != null) {
                        System.out.println("Usuário encontrado: " + usuarioConsultado);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Atualizar Usuário");
                    System.out.print("Informe o ID do Usuário a ser atualizado: ");
                    int idAtualizacao = scanner.nextInt();
                    Usuario usuarioAtualizar = usuarioDAO.readUsuario(idAtualizacao);
                    if (usuarioAtualizar != null) {
                        scanner.nextLine();
                        
                        System.out.print("Atualizar Nome Completo: ");
                        String atualizarNomeCompleto = scanner.nextLine();
                        usuarioAtualizar.setNomeCompleto(atualizarNomeCompleto);

                        System.out.print("Atualizar CPF: ");
                        String atualizarCpf = scanner.nextLine();
                        usuarioAtualizar.setCpf(atualizarCpf);

                        System.out.print("Atualizar Endereço: ");
                        String atualizarEndereco = scanner.nextLine();
                        usuarioAtualizar.setEndereco(atualizarEndereco);

                        System.out.print("Atualizar Email: ");
                        String atualizarEmail = scanner.nextLine();
                        usuarioAtualizar.setEmail(atualizarEmail);

                        System.out.print("Atualizar Senha: ");
                        String atualizarSenha = scanner.nextLine();
                        usuarioAtualizar.setSenha(atualizarSenha);

                        usuarioDAO.updateUsuario(usuarioAtualizar);
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

        scanner.close();
    }
}
