package br.com.dp.chanofresponsibility.impl;

import br.com.dp.chanofresponsibility.Desconto;
import br.com.dp.strategy.Item;
import br.com.dp.strategy.Orcamento;

public class DescontoAcimaQuinhentosReais implements Desconto {

	private Desconto proximoDesconto;
	private double valorCompra;

	@Override
	public double execute(Orcamento orcamento) {
		for (Item item : orcamento.getListaItens()) {
			valorCompra += item.getValor();
		}
		if (valorCompra > 500) {
			return valorCompra;
		} else {
			return proximoDesconto.execute(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		proximoDesconto = desconto;

	}

}
