package br.com.dp.chanofresponsibility.impl;

import br.com.dp.chanofresponsibility.Desconto;
import br.com.dp.strategy.Orcamento;

public class DescontoAcimaCincoItens implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double execute(Orcamento orcamento) {
		if (orcamento.getListaItens().size() > 5) {
			return orcamento.getListaItens().size();
		} else {
			return proximoDesconto.execute(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		proximoDesconto = desconto;

	}

}
