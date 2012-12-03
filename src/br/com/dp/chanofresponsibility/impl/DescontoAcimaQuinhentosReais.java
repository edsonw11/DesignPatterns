package br.com.dp.chanofresponsibility.impl;

import br.com.dp.chanofresponsibility.Desconto;
import br.com.dp.chanofresponsibility.Itenscompra.ItensCompra;
import br.com.dp.strategy.Item;

public class DescontoAcimaQuinhentosReais implements Desconto {

	private Desconto proximoDesconto;
	private double valorCompra;

	@Override
	public double execute(ItensCompra itensCompra) {
		for (Item item : itensCompra.getLista()) {
			valorCompra += item.getValor();
		}
		if (valorCompra > 500) {
			return valorCompra;
		} else {
			return proximoDesconto.execute(itensCompra);
		}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		proximoDesconto = desconto;

	}

}
