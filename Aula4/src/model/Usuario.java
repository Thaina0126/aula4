package model;

public class Usuario {

  private String Nome, Celular, Email, CPF, Senha;
 
  private boolean Estalogado = false;
  
  
  	Usuario(String Nome, String CPF, String Celular, String Email, String Senha) {
	 this.Nome = Nome;
	 this.Celular = Celular;
	 this.Email = Email;
	 this.Senha = Senha;
	 this.CPF = CPF;
 }
 
void Autenticacao(String Email, String Senha) {
	if(this.Email == Email && this.Senha == Senha) {
		Estalogado = true;
	}
}

public String getUsuario() {
	return ("\nNome" + this.Nome
			+ "\nCPF" + this.CPF
			+ "\nCelular" + this.Celular
			+ "\nEmail" + this.Email
			+ "\nSenha" + this.Senha
			+ "\nEstaLogado" + this.Estalogado
			);
	
}

}
