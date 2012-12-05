package br.com.dp.bulder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.dp.strategy.Item;

public class NotaFiscal {
	private Empresa empresa;
	private Integer numeroNota;
	private List<Item> itensDaLista;
	private Calendar dataCompra;
	private Double valorImposto;
	private Double valorDesconto;
	private String obs;

	public NotaFiscal(Empresa empresa, Integer numeroNota, List<Item> itensDaLista, Calendar dataCompra, Double valorImposto, Double valorDesconto, String obs) {
		super();
		this.empresa = empresa;
		this.numeroNota = numeroNota;
		this.itensDaLista = itensDaLista;
		this.dataCompra = dataCompra;
		this.valorImposto = valorImposto;
		this.valorDesconto = valorDesconto;
		this.obs = obs;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Integer getNumeroNota() {

		return numeroNota;
	}

	public void setNumeroNota(Integer numeroNota) {
		this.numeroNota = numeroNota;
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(Double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return "NotaFiscal [empresa=" + empresa + ", numeroNota=" + numeroNota + ", itensDaLista=" + itensDaLista + ", dataCompra=" + dataCompra
				+ ", valorImposto=" + valorImposto + ", valorDesconto=" + valorDesconto + ", obs=" + obs + "]";
	}

	public void adicionaItem(Item item) {
		if (itensDaLista == null)
			itensDaLista = new ArrayList<Item>();

		this.itensDaLista.add(item);

	}

}
