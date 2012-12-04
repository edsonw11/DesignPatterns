package br.com.dp.chanofresponsibility.impl;

import br.com.dp.chanofresponsibility.Desconto;
import br.com.dp.strategy.Orcamento;

public class DescontoSemDesconto implements Desconto{

	private Desconto proximoDesconto;

	@Override
	public double execute(Orcamento orcarmento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
	//nao faz nada, pois nao exite proximo desconto

	}
	

}
