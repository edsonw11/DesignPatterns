package br.com.dp.strategy.impl;

import br.com.dp.strategy.Imposto;
import br.com.dp.strategy.Orcamento;

public class ICMS implements Imposto {

	private Imposto impostoComposto;

	public ICMS(Imposto imposto) {
		super();
		this.impostoComposto = imposto;
	}

	public ICMS() {
		super();
	}

	@Override
	public double execute(Orcamento orcamento) {
		System.out.println("Calculando imposto ICMS");
		return ((orcamento.getValorOrcamento() * 0.1) + getImpostoComposto(orcamento));
	}

	double getImpostoComposto(Orcamento orcamento) {
		if (this.impostoComposto != null) {
			return impostoComposto.execute(orcamento);
		}
		return 0;
	}
}
