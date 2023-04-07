package br.com.globalhitss.cursojava.aula3103.exercicio2;

public class ContaBancaria {
	
	String nomeCliente;
	int numConta;
	float saldo;
	
	public void sacar(float valor) throws SaqueException {
		if(valor > this.saldo) {
			throw new SaqueException(this.saldo, valor);
		}else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void depositar(float valor) {
		this.saldo = valor + this.saldo;
	}
	

}
