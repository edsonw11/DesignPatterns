package br.com.dp.decorator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.dp.strategy.CalculoImposto;
import br.com.dp.strategy.Item;
import br.com.dp.strategy.Orcamento;
import br.com.dp.strategy.impl.ICMS;
import br.com.dp.strategy.impl.ICPP;
import br.com.dp.strategy.impl.ISSS;

public class DecoratorTest {

	private Orcamento orcamento;
	private CalculoImposto calculoImposto;

	@Before
	public void init() {
		calculoImposto = new CalculoImposto();
		Item geladeira = new Item("Geladeira", 500);
		Item fogao = new Item("Fogao", 500);
		orcamento = new Orcamento();
		orcamento.adiciona(geladeira);
		orcamento.adiciona(fogao);
	}

	@Test
	public void calculaImpostoCompostos() {
		assertEquals(490, calculoImposto.execute(new ICPP(new ICMS(new ISSS(new ICPP(new ICMS(new ISSS(new ICPP())))))), orcamento), 1l);

	}

}
