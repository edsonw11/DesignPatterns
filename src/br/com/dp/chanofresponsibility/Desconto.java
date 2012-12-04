package br.com.dp.chanofresponsibility;

import br.com.dp.strategy.Orcamento;

public interface Desconto {

	double execute(Orcamento orcamento);

	void setProximoDesconto(Desconto desconto);
}
