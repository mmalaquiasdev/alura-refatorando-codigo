package com.github.mmalaquiasdev.modulo03;

public class GeradorDeNotaFiscal {

	public NotaFiscal gera(Fatura fatura) {

		NotaFiscal nf = geraNf(fatura);

		new EnviadorDeEmail().enviaEmail(nf);
		new NFDao().salvaNoBanco(nf);

		return nf;
	}

	private NotaFiscal geraNf(Fatura fatura) {
		return new NotaFiscal(fatura.getValorMensal());
	}
}