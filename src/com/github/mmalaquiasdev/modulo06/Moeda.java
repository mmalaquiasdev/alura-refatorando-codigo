package com.github.mmalaquiasdev.modulo06;

public enum Moeda {
    VALOR_TAXA_EM_REAL(1.0),
    VALOR_TAXA_EM_DOLAR(2.7);

    private double taxa;

    Moeda(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
}
