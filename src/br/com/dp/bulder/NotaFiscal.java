package br.com.dp.bulder;

import java.util.Calendar;
import java.util.List;

import br.com.dp.strategy.Item;

public class NotaFiscal {
	private Integer numeroNota;
	private List<Item> itensDaLista;
	private Calendar dataCompra;
	private double valorImposto;
	private double valorDesconto;
	private String obs;

	public NotaFiscal(Integer numeroNota, List<Item> itensDaLista, Calendar dataCompra, Double valorImposto, Double valorDesconto, String obs) {
		super();
		this.numeroNota = numeroNota;
		this.itensDaLista = itensDaLista;
		this.dataCompra = dataCompra;
		this.valorImposto = valorImposto;
		this.valorDesconto = valorDesconto;
		this.obs = obs;
	}

	public Integer getNumeroNota() {
		return numeroNota;
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public String getObs() {
		return obs;
	}

	@Override
	public String toString() {
		return "NotaFiscal [numeroNota=" + numeroNota + ", itensDaLista=" + itensDaLista + ", dataCompra=" + dataCompra + ", valorImposto=" + valorImposto
				+ ", valorDesconto=" + valorDesconto + ", obs=" + obs + "]";
	}

}
