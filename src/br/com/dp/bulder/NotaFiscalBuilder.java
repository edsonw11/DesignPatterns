package br.com.dp.bulder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.dp.strategy.Item;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String ie;
	private String cnpj;
	private String obs;
	private Calendar dataCompra;
	private Double valorDesconto;
	private Double valorImposto;
	private String obs2;
	private Integer numeroNota;
	private List<Item> lista;

	public NotaFiscalBuilder() {
		super();

	}

	public NotaFiscalBuilder paraNomeEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder paraCnpjEmpresa(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder paraIEEmpresa(String ie) {
		this.ie = ie;
		return this;
	}

	public NotaFiscalBuilder paraOBsEmpresa(String obs) {
		this.obs = obs;
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

	public NotaFiscalBuilder paraValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
		return this;
	}

	public NotaFiscalBuilder paraValorImposto(Double valorImposto) {
		this.valorImposto = valorImposto;
		return this;
	}

	public NotaFiscalBuilder paraObs(String obs) {
		obs2 = obs;
		return this;
	}

	public NotaFiscalBuilder adiciona(Item item) {
		if (lista == null) {
			lista = new ArrayList<Item>();
		}
		lista.add(item);
		return this;
	}

	public NotaFiscal constroiNotaFiscal() {
		return new NotaFiscal(new Empresa(razaoSocial, cnpj, ie, obs), numeroNota, lista, dataCompra, valorImposto, valorDesconto, obs2);

	}
}
