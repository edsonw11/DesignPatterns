package br.com.dp.chanofresponsibility;

public interface Desconto {

	double execute(ItensCompra itensCompra);

	void setProximoDesconto(Desconto desconto);
}
