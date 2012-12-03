package br.com.dp.chanofresponsibility;

import br.com.dp.chanofresponsibility.impl.DescontoAcimaCincoItens;
import br.com.dp.chanofresponsibility.impl.DescontoAcimaQuinhentosReais;
import br.com.dp.chanofresponsibility.impl.DescontoSemDesconto;

public class CalculaDesconto {

	public Object execute(ItensCompra itensCompra) {
		DescontoAcimaQuinhentosReais descontoAcimaQuinhentosReais = new DescontoAcimaQuinhentosReais();
		DescontoAcimaCincoItens descontoAcimaCincoItens = new DescontoAcimaCincoItens();
		DescontoSemDesconto desSemDesconto = new DescontoSemDesconto();

		descontoAcimaQuinhentosReais.setProximoDesconto(descontoAcimaCincoItens);
		descontoAcimaCincoItens.setProximoDesconto(desSemDesconto);

		return descontoAcimaQuinhentosReais.execute(itensCompra);
	}

}
