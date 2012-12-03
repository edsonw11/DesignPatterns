package br.com.dp.chanofresponsibility.Itenscompra;

import java.util.ArrayList;
import java.util.List;

import br.com.dp.strategy.Item;

public class ItensCompra {

	private List<Item> lista;

	public ItensCompra() {
		super();
		lista = new ArrayList<Item>();
	}

	public void adiciona(Item item) {
		lista.add(item);

	}

	public List<Item> getLista() {
		return lista;
	}

}
