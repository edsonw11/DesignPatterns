package br.com.dp.strategy.impl;

import br.com.dp.strategy.Imposto;
import br.com.dp.strategy.Orcamento;

public class ISSS implements Imposto {

	private Imposto impostoComposto;

	public ISSS(Imposto imposto) {
		super();
		this.impostoComposto = imposto;
	}

	public ISSS() {
		super();
	}

	@Override
	public double execute(Orcamento orcamento) {
		return ((orcamento.getValorOrcamento() * 0.07) + getImpostoComposto(orcamento));
	}

	double getImpostoComposto(Orcamento orcamento) {
		if (this.impostoComposto != null) {
			return impostoComposto.execute(orcamento);
		}
		return 0;
	}

}
