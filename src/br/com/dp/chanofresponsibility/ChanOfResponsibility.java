package br.com.dp.chanofresponsibility;

import br.com.dp.strategy.Item;
import br.com.dp.strategy.Orcamento;

public class ChanOfResponsibility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Design Patterns para bons programadores - ChanOfResponsibility");
		Item celular = new Item("Celular", 100);
		Item caneta = new Item("Caneta", 100);
		Item caderno = new Item("Caderno", 100);
		Item lapis = new Item("Lapis", 100);
		Item borracha = new Item("Borracha", 100);
		Item fone = new Item("Fone", 100);

		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(celular);
		orcamento.adiciona(caneta);
		orcamento.adiciona(caderno);
		orcamento.adiciona(lapis);
		orcamento.adiciona(borracha);
		orcamento.adiciona(fone);
		CalculaDesconto calculaDesconto = new CalculaDesconto();
		System.out.println(calculaDesconto.execute(orcamento));

	}

}
