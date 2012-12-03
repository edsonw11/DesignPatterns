package br.com.dp.strategy.impl;

import br.com.dp.strategy.Imposto;
import br.com.dp.strategy.Orcamento;

public class ICMS implements Imposto {

	@Override
	public double execute(Orcamento orcamento) {
		System.out.println("Calculando imposto ICMS");
		return 0;
	}

}
