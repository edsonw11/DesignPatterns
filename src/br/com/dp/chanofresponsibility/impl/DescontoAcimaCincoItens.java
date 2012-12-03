package br.com.dp.chanofresponsibility.impl;

import br.com.dp.chanofresponsibility.Desconto;
import br.com.dp.chanofresponsibility.Itenscompra.ItensCompra;

public class DescontoAcimaCincoItens implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double execute(ItensCompra itensCompra) {
		if (itensCompra.getLista().size() > 5) {
			return itensCompra.getLista().size();
		} else {
			return proximoDesconto.execute(itensCompra);
		}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		proximoDesconto = desconto;

	}

}
