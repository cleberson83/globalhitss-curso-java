package br.com.globalhitss.cursojava.aula3103.exercicio3;

public class Mamifero extends Animal{
	
	String alimento;

	public Mamifero(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade,
			String alimento) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	@Override
	public void dados() {
		super.dados();
		System.out.println("Alimento: " + this.alimento);
	}
	
	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	

}
