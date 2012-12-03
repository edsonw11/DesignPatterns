package br.com.dp.chanofresponsibility.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.dp.chanofresponsibility.CalculaDesconto;
import br.com.dp.chanofresponsibility.Itenscompra.ItensCompra;
import br.com.dp.strategy.Item;

public class ChanOfResponsibilityTest {

	@Before
	public void inti() {

	}

	@Test
	public void doCalculaDescontoAcimaQuinhentosRais() {
		Item celular = new Item("Celular", 100);
		Item caneta = new Item("Caneta", 100);
		Item caderno = new Item("Caderno", 100);
		Item lapis = new Item("Lapis", 100);
		Item borracha = new Item("Borracha", 100);
		Item fone = new Item("Fone", 100);

		ItensCompra itensCompra = new ItensCompra();
		itensCompra.adiciona(celular);
		itensCompra.adiciona(caneta);
		itensCompra.adiciona(caderno);
		itensCompra.adiciona(lapis);
		itensCompra.adiciona(borracha);
		itensCompra.adiciona(fone);
		CalculaDesconto calculaDesconto = new CalculaDesconto();
		assertEquals(600.00, calculaDesconto.execute(itensCompra));

	}

	@Test
	public void doCalculaDescontoAcimaDeCincoItens() {
		Item celular = new Item("Celular", 10);
		Item caneta = new Item("Caneta", 10);
		Item caderno = new Item("Caderno", 10);
		Item lapis = new Item("Lapis", 10);
		Item borracha = new Item("Borracha", 10);
		Item fone = new Item("Fone", 100);

		ItensCompra itensCompra = new ItensCompra();
		itensCompra.adiciona(celular);
		itensCompra.adiciona(caneta);
		itensCompra.adiciona(caderno);
		itensCompra.adiciona(lapis);
		itensCompra.adiciona(borracha);
		itensCompra.adiciona(fone);

		CalculaDesconto calculaDesconto = new CalculaDesconto();
		assertEquals(6.0, calculaDesconto.execute(itensCompra));

	}

	@Test
	public void doCalculaDescontoSemDesconto() {
		Item celular = new Item("Celular", 10);
		Item caneta = new Item("Caneta", 10);
		Item caderno = new Item("Caderno", 10);
		Item lapis = new Item("Lapis", 10);
		Item borracha = new Item("Borracha", 10);

		ItensCompra itensCompra = new ItensCompra();
		itensCompra.adiciona(celular);
		itensCompra.adiciona(caneta);
		itensCompra.adiciona(caderno);
		itensCompra.adiciona(lapis);
		itensCompra.adiciona(borracha);

		CalculaDesconto calculaDesconto = new CalculaDesconto();
		assertEquals(0.0, calculaDesconto.execute(itensCompra));

	}

}
