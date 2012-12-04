package br.com.dp.strategy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.dp.strategy.CalculoImposto;
import br.com.dp.strategy.Imposto;
import br.com.dp.strategy.Item;
import br.com.dp.strategy.Orcamento;
import br.com.dp.strategy.impl.ICMS;
import br.com.dp.strategy.impl.ICPP;
import br.com.dp.strategy.impl.ISSS;

public class DPStrategyTest {

	private Item geladeira;
	private Orcamento orcamento;
	private Imposto iCMS;
	private Item fogao;
	private ISSS iSSS;
	private ICPP iCPP;
	private CalculoImposto calculoImposto;

	@Before
	public void init() {
		calculoImposto = new CalculoImposto();
		geladeira = new Item("Geladeira", 500);
		fogao = new Item("Fogao", 500);
		orcamento = new Orcamento();
		orcamento.adiciona(geladeira);
		orcamento.adiciona(fogao);
		iCMS = new ICMS();
		iSSS = new ISSS();
		iCPP = new ICPP();

	}

	@Test
	public void calculaImpostoICMS() {
		assertEquals(100, calculoImposto.execute(iCMS, orcamento), 1l);

	}

	@Test
	public void calculaImpostoISSS() {
		assertEquals(70, calculoImposto.execute(iSSS, orcamento), 1l);

	}

	@Test
	public void calculaImpostoICPP() {
		assertEquals(50, calculoImposto.execute(iCPP, orcamento), 1l);

	}

}
