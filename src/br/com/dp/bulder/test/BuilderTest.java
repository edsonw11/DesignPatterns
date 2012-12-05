package br.com.dp.bulder.test;

import java.util.Calendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.dp.bulder.NotaFiscal;
import br.com.dp.bulder.NotaFiscalBuilder;
import br.com.dp.strategy.Item;

public class BuilderTest {

	private NotaFiscalBuilder nfb = new NotaFiscalBuilder();
	private NotaFiscal nf;

	@Before
	public void init() {

		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		criador.paraNomeEmpresa("empresaTeste").paraCnpjEmpresa("123456789").paraIEEmpresa("123").paraOBsEmpresa("OBsEmpresa").paraValorDesconto(80.0)
				.paraValorImposto(15.0).adiciona(new Item("Geladeira", 1500)).adiciona(new Item("Caneta", 1.20)).adiciona(new Item("Caderno", 20.0))
				.adiciona(new Item("Copo", 16.90)).adiciona(new Item("Fogao", 999.00)).paraObs("OBs notas Teste").paraDataCompra(Calendar.getInstance())
				.paraNumeroNotaFical(1980);

		nf = criador.constroiNotaFiscal();

	}

	@Test
	public void criateNotaFiscal() {
		Assert.assertEquals(nf, nf);

	}

	@Test
	public void calculaValorDesconto() {
		Assert.assertEquals(80.0, nf.getValorDesconto(), 1l);
	}

	@Test
	public void calculaValorImposto() {
		Assert.assertEquals(15, nf.getValorImposto(), 1l);
	}

}
