package model;

public class Banco {

	private String nome_banco;
	private String certificado_autorizacao;
	
	public String GetNomeBanco() {
		return nome_banco;
	}
	
	public String GetCertificadoAutorizacao() {
		return certificado_autorizacao;
	}
	
	public void SetNomeBanco (String Nome) {
	this.nome_banco = Nome;	
	}
	public void SetCertificadoAutorizacao(String Certificado) {
		this.certificado_autorizacao = Certificado;
	}
	}
