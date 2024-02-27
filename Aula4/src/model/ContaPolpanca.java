package model;

public class ContaPolpanca extends Conta{
	private double Rendimento;
	ContaPolpanca(String email, double Rendimento){
		super(email);
		this.Rendimento = Rendimento;
	}
	public String Saque (double valorSaque) {
		if(valorSaque <= saldo) {
		saldo = saldo - valorSaque;
		return ( "Valor Sacado: " + valorSaque +
				"\nValor Saldo Após o Saque: " + saldo );
		} else {
			return "Saldo Insuficiente";
		}
	}
	
	public String Deposito (double valorDeposito) {
		saldo += (valorDeposito + (valorDeposito * Rendimento));
		return ("Valor Sacado: " + valorDeposito
				+ "\nValor Saldo Após o Saque: "
				+ saldo);
		
	}
	
	public double getSaldo() {
		return saldo;
		
	}
}

