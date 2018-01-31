package com.github.mmalaquiasdev.modulo02;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	public boolean podeReservar(int qtdLugaresParaReservar) {
		int qtdLugaresDisponiveis = capacidade - getQtdLugaresReservados();
		return qtdLugaresDisponiveis >= qtdLugaresParaReservar;
	}

	private int getQtdLugaresReservados() {
		return vagoes
				.stream()
				.mapToInt(Vagao::reservados)
				.sum();
	}

}