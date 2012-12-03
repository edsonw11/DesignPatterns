package br.com.dp.strategy;

public class CalculoImposto {

	public double execute(Imposto imposto, Orcamento orcamento) {
		return imposto.execute(orcamento);

	}
}
