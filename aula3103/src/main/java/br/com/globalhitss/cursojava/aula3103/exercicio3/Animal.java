package br.com.globalhitss.cursojava.aula3103.exercicio3;

public class Animal {
	
	
	String nome;
	int comprimento;
	int patas;
	String cor;
	String ambiente;
	float velocidade;
	
	
	
	public Animal(String nome, int comprimento, int patas, String cor, String ambiente, float velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}


	public void dados() {
		// imprime os dados do animal
		System.out.println("nome: " + nome);
		System.out.println("comprimento: " + comprimento);
		System.out.println("patas: " + patas);
		System.out.println("cor: " + cor);
		System.out.println("ambiente: " + ambiente);
		System.out.println("velocidade: " + velocidade);
	}
	
	
	void alteraNome(String nome) {
		this.nome = nome;
	}
	
	void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	void alteraPatas(int patas) {
		this.patas = patas;
	}
	
	void alteraCor(String cor) {
		this.cor = cor;
	}
	
	void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

}
