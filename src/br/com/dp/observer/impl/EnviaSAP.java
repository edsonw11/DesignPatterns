package br.com.dp.observer.impl;

import br.com.dp.observer.ActionsAfter;

public class EnviaSAP implements ActionsAfter {

	@Override
	public void envia() {
		System.out.println("envia para o SAP");
	}

}
