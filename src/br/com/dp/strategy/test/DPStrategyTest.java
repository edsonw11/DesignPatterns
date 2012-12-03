package br.com.dp.strategy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.dp.strategy.CalculoImposto;
import br.com.dp.strategy.Imposto;
import br.com.dp.strategy.Item;
import br.com.dp.strategy.Orcamento;
import br.com.dp.strategy.impl.ICMS;
import br.com.dp.strategy.impl.ISSS;

public class DPStrategyTest {

	private Item geladeira;
	private Orcamento orcamento;
	private Imposto iCMS;
	private Item fogao;
	private ISSS iSSS;

	@Before
	public void init() {
		geladeira = new Item("Geladeira", 500);
		fogao = new Item("Fogao", 500);
		orcamento = new Orcamento();
		orcamento.adiciona(geladeira);
		orcamento.adiciona(fogao);
		iCMS = new ICMS();
		iSSS = new ISSS();

	}

	@Test
	public void calculaImposto() {
		CalculoImposto calculoImposto = new CalculoImposto();
		assertEquals(100, calculoImposto.execute(iCMS, orcamento),1l);
		assertEquals(70, calculoImposto.execute(iSSS, orcamento),1l);

	}

}
