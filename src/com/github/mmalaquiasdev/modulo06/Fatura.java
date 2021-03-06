package com.github.mmalaquiasdev.modulo06;

import static com.github.mmalaquiasdev.modulo06.Moeda.*;

public class Fatura {

	private double valorMensal;
	private String cliente;

	public Fatura() {}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}
	public double getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double emReal(){
		return converteValor(VALOR_TAXA_EM_REAL.getTaxa());
	}
	public double emDolar(){
		return converteValor(VALOR_TAXA_EM_DOLAR.getTaxa());
	}
	private double converteValor(double taxa) {
		return valorMensal * taxa;
	}
}
