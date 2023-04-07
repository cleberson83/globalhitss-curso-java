package br.com.globalhitss.cursojava.financiamento;

public class EntradaMinima extends Exception {
	
	public Double valorTotal;
	public Double entrada;
	public Double porcentagemMinima;
	
	public EntradaMinima(Double valorTotal, Double entrada, Double porcentagemMinima) {
		super();
		this.valorTotal = valorTotal;
		this.entrada = entrada;
		this.porcentagemMinima = porcentagemMinima;
	}
	
	@Override
	public String toString() {
		return "Entrada de " + entrada + " tem que ser ao menos " + (porcentagemMinima * 100) + " do valor total (" + valorTotal + ")"; 
	}
	
	
	

}
