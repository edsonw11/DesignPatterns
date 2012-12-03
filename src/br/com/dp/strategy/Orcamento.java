package br.com.dp.strategy;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private List<Item> listaItens;
	private double valorOrcamento;

	public Orcamento() {
		super();
		listaItens = new ArrayList<Item>();
	}

	public void adiciona(Item item) {
		listaItens.add(item);
	}

	public double getValorOrcamento() {
		valorOrcamento = 0;
		if (listaItens.size() > 0) {
			for (Item item : listaItens) {
				valorOrcamento += item.getValor();
			}
			return valorOrcamento;
		} else {
			return 0;
		}
	}
}
