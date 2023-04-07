package br.com.globalhitss.cursojava.aula3103.exercicio2;

public class SaqueException extends Exception {
	
	public float saldo;
	public float valorDeSaque;
	
	public SaqueException(float saldo, float valorDeSaque) {
		super();
		this.saldo = saldo;
		this.valorDeSaque = valorDeSaque;
	}
	
	@Override
	public String toString() {
		return "O valor a sacar de R$ " + this.valorDeSaque + " é menor que o saldo de R$ " + this.saldo;
	}

}
