package br.com.dp.strategy;

import br.com.dp.strategy.impl.ICMS;

/**
 * Quando utilizamos uma hierarquia, como fizemos com a interface Imposto e as
 * implementa��es ICMS e ISS, e recebemos o tipo mais gen�rico como par�metro,
 * para ganharmos o polimorfismo na regra que ser� executada, simplificando o
 * c�digo e sua evolu��o, estamos usando o Design Pattern chamado Strategy.
 * Repare que a cria��o de uma nova estrat�gia de c�lculo de imposto n�o implica
 * em mudan�as no c�digo escrito acima! Basta criarmos uma nova classe que
 * implementa a interface Imposto, que nosso CalculadorDeImposto conseguir�
 * calcul�-lo sem precisar de nenhuma altera��o!
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
