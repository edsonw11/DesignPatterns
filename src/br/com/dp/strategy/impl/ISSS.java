package br.com.dp.strategy.impl;

import br.com.dp.strategy.Imposto;
import br.com.dp.strategy.Orcamento;

public class ISSS implements Imposto {

	@Override
	public double execute(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.07;
	}

}
