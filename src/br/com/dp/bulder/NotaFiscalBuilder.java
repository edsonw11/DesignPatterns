package br.com.dp.bulder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.dp.observer.ActionsAfter;
import br.com.dp.observer.impl.EnviadorEmail;
import br.com.dp.observer.impl.EnviadorSMS;
import br.com.dp.strategy.Item;

public class NotaFiscalBuilder {

	private Integer numeroNota;
	private Item item;
	private Calendar dataCompra;
	private double valorDesconto;
	private double valorImposto;
	private String obs;
	private List<Item> lista;
	private List<ActionsAfter> listAcoes;

	public NotaFiscalBuilder() {
		super();
		listAcoes = new ArrayList<ActionsAfter>();
	}

	public NotaFiscalBuilder adiciaActionAfter(ActionsAfter actionAfter) {
		listAcoes.add(actionAfter);
		return this;
	}

	public NotaFiscalBuilder paraNumeroNotaFical(Integer numeroNota) {
		this.numeroNota = numeroNota;
		return this;
	}

	public NotaFiscalBuilder paraDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
		return this;
	}

	public NotaFiscalBuilder paraObs(String obs) {
		this.obs = obs;
		return this;
	}

	public NotaFiscalBuilder adiciona(Item item) {
		if (lista == null) {
			lista = new ArrayList<Item>();
		}
		valorDesconto += item.getValor() * 0.1;
		valorImposto += item.getValor() * 0.05;
		lista.add(item);
		return this;
	}

	public NotaFiscal constroiNotaFiscal() {
		NotaFiscal nf = new NotaFiscal(numeroNota, lista, dataCompra, valorImposto, valorDesconto, obs);

		EnviadorEmail email = new EnviadorEmail();
		EnviadorSMS sms = new EnviadorSMS();

		for (ActionsAfter acoes : listAcoes) {
			acoes.envia();
		}
		return nf;

	}
}
