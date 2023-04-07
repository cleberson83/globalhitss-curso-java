package br.com.globalhitss.cursojava.aula3103.exercicio3;

public class TesteAnimais {

	public static void main(String[] args) {

		Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0f, "Grama");
		camelo.dados();
		
		System.out.println("-------------------------------- ");
		
		Peixe tubarao = new Peixe("Tubarão", 2, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda" );
		tubarao.dados();
		
		System.out.println("-------------------------------- ");
		
		Mamifero ursoDoCanada = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 5.0f, "Mel");
		ursoDoCanada.dados();
		
		
	}

}
