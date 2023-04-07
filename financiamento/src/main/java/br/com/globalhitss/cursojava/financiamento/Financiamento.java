package br.com.globalhitss.cursojava.financiamento;

public class Financiamento {

	public Double valorTotal;
	public Double entrada;
	public Integer parcelas;
	
	public Financiamento(Double valorTotal, Double entrada, Integer parcelas) throws EntradaMinima {
		
		if(entrada < valorTotal * 0.2) {
//			throw new RuntimeException("Entrada tem que ser ao menos 20% do valor total.");
			throw new EntradaMinima(valorTotal, entrada, 0.2);
		} else if (parcelas < 5) {
			throw new RuntimeException("O numero minimo de parcelas deve ser 5.");
		} else {
			this.valorTotal = valorTotal;
			this.entrada = entrada;
			this.parcelas = parcelas;
		}
		
		
		
	}
	
	public double prestacao() {
		return (valorTotal - entrada) / parcelas;
	}
	
}
