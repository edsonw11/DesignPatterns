package br.com.dp.chanofresponsibility;

import br.com.dp.chanofresponsibility.Itenscompra.ItensCompra;

public interface Desconto {

	double execute(ItensCompra itensCompra);

	void setProximoDesconto(Desconto desconto);
}
