package br.com.globalhitss.cursojava.financiamento;

public class Principal {

	public static void main(String[] args) throws EntradaMinima {
		
		double valorTotal = 1000.0;
		double entrada = 50.0;
		int parcelas = 1;
		
		
		//Entrada tem que ser ao menos 20% do valor total
		//O numero minimo de parcelas deve ser 5
		
		try {
			Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
			System.out.println(f.prestacao());
		} catch (EntradaMinima | RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Sempre sou executado");
		}
		
		
	}
	
}
