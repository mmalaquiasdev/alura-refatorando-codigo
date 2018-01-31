package com.github.mmalaquiasdev.modulo04;

public class ContaPJ {

	private String titular;
	private double saldo;

	public ContaPJ(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	public void saca(double valor) {
		saldo -= valor + 0.2;
	}
	
	public void deposita(double valor) {
		saldo += valor - 0.2;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
}
