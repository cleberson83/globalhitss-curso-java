package br.com.globalhitss.cursojava.aula3103.exercicio2;

public class ContaEspecial extends ContaBancaria {
	
	float limite = 600;
	
	@Override
	public void sacar(float valor) throws SaqueException {
		if(valor > super.saldo) {
			if((valor - super.saldo) > limite) {
				throw new SaqueException(this.saldo, limite);
			}
		} else {
			super.saldo = super.saldo - valor;
		}
	}

}
