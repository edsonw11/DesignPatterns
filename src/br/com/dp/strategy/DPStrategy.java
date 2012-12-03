package br.com.dp.strategy;

import br.com.dp.strategy.impl.ICMS;

/**
 * Quando utilizamos uma hierarquia, como fizemos com a interface Imposto e as
 * implementações ICMS e ISS, e recebemos o tipo mais genérico como parâmetro,
 * para ganharmos o polimorfismo na regra que será executada, simplificando o
 * código e sua evolução, estamos usando o Design Pattern chamado Strategy.
 * Repare que a criação de uma nova estratégia de cálculo de imposto não implica
 * em mudanças no código escrito acima! Basta criarmos uma nova classe que
 * implementa a interface Imposto, que nosso CalculadorDeImposto conseguirá
 * calculá-lo sem precisar de nenhuma alteração!
 * 
 * */
public class DPStrategy {

	public static void main(String[] args) {
		System.out.println("Design Patterns para bons programadores - Strategy");
		Item item = new Item("Geladeira", 1600);

		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(item);
		Imposto ICMS = new ICMS();

		CalculoImposto calculoImposto = new CalculoImposto();
		System.out.println(calculoImposto.execute(ICMS, orcamento));

	}

}
