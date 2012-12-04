package br.com.dp.strategy.impl;

import br.com.dp.strategy.Imposto;
import br.com.dp.strategy.Orcamento;

public class ICPP implements Imposto {

	private Imposto impostoComposto;

	public ICPP(Imposto imposto) {
		super();
		this.impostoComposto = imposto;
	}

	public ICPP() {
		super();
	}

	@Override
	public double execute(Orcamento orcamento) {
		return ((orcamento.getValorOrcamento() * 0.05) + getImpostoComposto(orcamento));
	}

	double getImpostoComposto(Orcamento orcamento) {
		if (this.impostoComposto != null) {
			return impostoComposto.execute(orcamento);
		}
		return 0;
	}

}
