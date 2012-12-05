package br.com.dp.bulder.test;

import java.util.Calendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.dp.bulder.NotaFiscal;
import br.com.dp.bulder.NotaFiscalBuilder;
import br.com.dp.observer.impl.EnviaSAP;
import br.com.dp.observer.impl.EnviadorEmail;
import br.com.dp.observer.impl.EnviadorSMS;
import br.com.dp.strategy.Item;

public class BuilderTest {

	private NotaFiscalBuilder criador;
	private NotaFiscal nf;

	@Before
	public void init() {

		criador = new NotaFiscalBuilder();
		criador = new NotaFiscalBuilder();
		criador.paraNumeroNotaFical(1980).paraDataCompra(Calendar.getInstance()).adiciona(new Item("Geladeira", 100)).adiciona(new Item("Caneta", 100))
				.adiciona(new Item("Caderno", 100)).adiciona(new Item("Copo", 100)).adiciona(new Item("Fogao", 100)).paraObs("OBs notas Teste")
				.adiciaActionAfter(new EnviadorEmail()).adiciaActionAfter(new EnviadorSMS()).adiciaActionAfter(new EnviaSAP());

		nf = criador.constroiNotaFiscal();

	}

	@Test
	public void criateNotaFiscal() {
		Assert.assertEquals(nf.getNumeroNota(), nf.getNumeroNota());

	}

	@Test
	public void calculaValorDesconto() {
		Assert.assertEquals(50, nf.getValorDesconto(), 1l);
	}

	@Test
	public void calculaValorImposto() {
		Assert.assertEquals(25, nf.getValorImposto(), 1l);
	}

}
