package br.com.globalhitss.cursojava.aula3103.exercicio2;

public class ContaPoupanca extends ContaBancaria {
	
	int diaDeRendimento;
	
	public float calcularNovoSaldo(int taxa) {
		float novoSaldo = ((taxa/100f) * super.saldo) + super.saldo;
		return super.saldo = novoSaldo;
	}

}
