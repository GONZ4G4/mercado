package br.com.mercado.model;

public class Caixa extends Funcionario{
	// criando as vari�veis de Login e Senha para utilizar na caixa registradora
	public String Login;
	public String Senha;
	
	//criando o construtor sem par�metro
	public Caixa() {
		
	}
	
	//criando o construtor com par�metro
	public Caixa(String Login, String Senha) {
		this.Login = Login;
		this.Senha = Senha;
	}
	
	// gets e sets
	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	// M�todo para inser��o de Login e Senha;
	public void LoginCaixaReg(String Login, String Senha) {
		System.out.println("- Para entrar na caixa registradora, necessita-se de um login e senha -");
		System.out.println("Insira o seu Login:");
		this.Login = Login;
		System.out.println("Insira a sua Senha:");
		this.Senha = Senha;
	}
}