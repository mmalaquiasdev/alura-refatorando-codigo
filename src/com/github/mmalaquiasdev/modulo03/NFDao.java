package com.github.mmalaquiasdev.modulo03;

public class NFDao {
	public void salvaNoBanco(NotaFiscal nf) {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)"+
					 "values (?," + nf.getValorLiquido() + ")";
		
		System.out.println("Salvando no banco" + sql);
	}

}
