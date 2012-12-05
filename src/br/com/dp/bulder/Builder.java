package br.com.dp.bulder;

import java.util.Calendar;

import br.com.dp.strategy.Item;

public class Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Design Patterns para bons programadores - Builder");
		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		criador.paraNomeEmpresa("empresaTeste").paraCnpjEmpresa("123456789").paraIEEmpresa("123").paraOBsEmpresa("OBsEmpresa").paraValorDesconto(80.0)
				.paraValorImposto(15.0).adiciona(new Item("Geladeira", 1500)).adiciona(new Item("Caneta", 1.20))
				.adiciona(new Item("Caderno", 20.0)).adiciona(new Item("Copo", 16.90)).adiciona(new Item("Fogao", 999.00))
				.paraObs("OBs notas Teste").paraDataCompra(Calendar.getInstance()).paraNumeroNotaFical(1980);

		NotaFiscal nf = criador.constroiNotaFiscal();
		System.out.println(nf);
	}
}
