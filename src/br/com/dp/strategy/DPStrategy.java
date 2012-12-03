package br.com.dp.strategy;

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
		CalculoImposto calculoImposto = new CalculoImposto();
		new Imposto() {
			
			@Override
			public double execute(Orcamento orcamento) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
//		calculoImposto.execute(imposto, orcamento)
	}

}
