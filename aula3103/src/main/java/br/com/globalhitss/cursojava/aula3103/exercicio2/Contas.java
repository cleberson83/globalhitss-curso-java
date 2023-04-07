package br.com.globalhitss.cursojava.aula3103.exercicio2;

public class Contas {
	
	public static void main(String[] args) {
		
		Contas c = new Contas();
		c.atualizarContaBancaria();
		c.atualizarContaPoupanca();
		c.atualizarContaEspecial();
		
		
	}
	
	public void atualizarContaBancaria(){
		
		ContaBancaria cb = new ContaBancaria();
		cb.nomeCliente = "Cleberson Dias";
		cb.numConta = 123456;
		cb.saldo = 1000f;
		
		System.out.println("Nome: " + cb.nomeCliente );
		
		cb.depositar(1000f);
		try {
			cb.sacar(5000f);
			System.out.println("Saldo Conta Corrente:" + cb.saldo);
		} catch (SaqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void atualizarContaPoupanca() {
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.nomeCliente = "Jose";
		cp.numConta = 5567;
		cp.saldo = 500;
		
		System.out.println("Nome: " + cp.nomeCliente );
		
		cp.saldo = cp.calcularNovoSaldo(20);
		System.out.println("Saldo Conta Poupança:" + cp.saldo);
		
	}
	
	public void atualizarContaEspecial() {
		
		ContaEspecial ce = new ContaEspecial();
		ce.nomeCliente = "Bruno";
		ce.numConta = 5567;
		ce.saldo = 1000;
		
		System.out.println("Nome: " + ce.nomeCliente );
		
		try {
			ce.sacar(1200);
			System.out.println("Saldo Conta Especial:" + ce.saldo);
		} catch (SaqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
