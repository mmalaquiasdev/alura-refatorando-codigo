package com.github.mmalaquiasdev.modulo01;

public class GeradorDeNotaFiscal {

	public NotaFiscal gera(Fatura fatura) {
		NotaFiscal nf = gerarNotaFiscal(fatura);
		enviarEmail(nf);
		salvarNoBanco(nf);

		return nf;
	}

	private void salvarNoBanco(NotaFiscal nf) {
		String sql = "insert into notafiscal (cliente, valor)"+
					 "values (?," + nf.getValorLiquido() + ")";

		System.out.println("Salvando no banco" + sql);
	}

	private void enviarEmail(NotaFiscal nf) {
		String msgDoEmail = "Caro cliente,<br/>";
		msgDoEmail += "É com prazer que lhe avisamos que sua nota fiscal foi "
				+ "gerada no valor de " + nf.getValorLiquido() + ".<br/>";
		msgDoEmail += "Acesse o site da prefeitura e faça o download.<br/><br/>";
		msgDoEmail += "Obrigado!";

		System.out.println(msgDoEmail);
	}

	private NotaFiscal gerarNotaFiscal(Fatura fatura) {
		double valor = fatura.getValorMensal();
		double imposto = 0;
		if(valor < 200) {
			imposto = valor * 0.03;
		}
		else if(valor > 200 && valor <= 1000) {
			imposto = valor * 0.06;
		}
		else {
			imposto = valor * 0.07;
		}

		return new NotaFiscal(valor, imposto);
	}
}