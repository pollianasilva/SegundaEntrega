package model;

public class Usuario {
private int idUsuario;
private String Login;
private String Senha;
private String HistoricoViagens;

public Usuario () {}
	

public Usuario(String login2, String senha2, String historicoviagens2) {
	// TODO Auto-generated constructor stub
}


public int getidUsuario () {
	return idUsuario;
}
public void setidUsuario (int idUsuario) {
	this.idUsuario = idUsuario;
}
public String getLogin () {
	return Login;
}
public void setLogin (String Login) {
	this.Login = Login;
}

public String getSenha () {
	return Senha;
}
public void setSenha (String Senha) {
	this.Senha = Senha;
}

public String getHistoricoViagens () {
	return HistoricoViagens;
}
public void setHistoricoViagens (String HistoricoViagens) {
	this.HistoricoViagens = HistoricoViagens;
}

@Override
public String toString() {
	return "Usuario [Login=" + Login + ", Senha=" + Senha + ", Historico de Viagens=" + HistoricoViagens + "]";
}

public int getid() {
	return 0;
}
}