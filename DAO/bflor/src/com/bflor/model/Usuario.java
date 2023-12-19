package com.bflor.model;

public class Usuario {
    private int idUsuario;
    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nomeCompleto, String cpf, String endereco, String email, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario [Nome Completo=" + nomeCompleto + ", CPF=" + cpf + ", Endereço=" + endereco + ", Email=" + email
                + ", Senha=" + senha + "]";
    }

    public int getid() {
        return 0;
    }
}
