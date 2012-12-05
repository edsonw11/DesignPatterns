package br.com.dp.bulder;

import java.util.Calendar;

import br.com.dp.observer.impl.EnviaSAP;
import br.com.dp.observer.impl.EnviadorEmail;
import br.com.dp.observer.impl.EnviadorSMS;
import br.com.dp.strategy.Item;

public class Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Design Patterns para bons programadores - Builder");

		NotaFiscalBuilder criador;
		criador = new NotaFiscalBuilder();
		criador.paraNumeroNotaFical(1980).paraDataCompra(Calendar.getInstance()).adiciona(new Item("Geladeira", 100)).adiciona(new Item("Caneta", 100))
				.adiciona(new Item("Caderno", 100)).adiciona(new Item("Copo", 100)).adiciona(new Item("Fogao", 100)).paraObs("OBs notas Teste")
				.adiciaActionAfter(new EnviadorEmail()).adiciaActionAfter(new EnviadorSMS()).adiciaActionAfter(new EnviaSAP());

		NotaFiscal nf = criador.constroiNotaFiscal();
		System.out.println(nf);
	}
}
