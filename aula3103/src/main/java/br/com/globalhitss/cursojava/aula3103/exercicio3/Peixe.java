package br.com.globalhitss.cursojava.aula3103.exercicio3;

public class Peixe extends Animal{
	
	String caracteristicas;

	public Peixe(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade,
			String caracteristicas) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
	}

	@Override
	public void dados() {
		super.dados();
		System.out.println("Caracteristicas: " + this.caracteristicas);
	}
	
	public void alteraCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	

}
