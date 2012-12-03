package br.com.dp.strategy;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	List<Item> listaItens;

	public Orcamento() {
		super();
		listaItens = new ArrayList<Item>();
	}

	public void adiciona(Item item) {
		listaItens.add(item);
	}
}
