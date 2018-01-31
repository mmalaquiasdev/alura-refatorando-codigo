package com.github.mmalaquiasdev.modulo02;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	public boolean podeReservar(int qtdLugaresParaReservar) {
		
		int qtdLugaresReservados = 0;
		for(Vagao vagao : vagoes) {
			qtdLugaresReservados += vagao.reservados();
		}
		
		int qtdLugaresDisponiveis = capacidade - qtdLugaresReservados;
		return qtdLugaresDisponiveis >= qtdLugaresParaReservar;
	}
	
}