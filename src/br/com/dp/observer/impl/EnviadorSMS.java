package br.com.dp.observer.impl;

import br.com.dp.observer.ActionsAfter;

public class EnviadorSMS implements ActionsAfter{
	
	public void envia(){
		System.out.println("enviado por SMS");
	}

}
