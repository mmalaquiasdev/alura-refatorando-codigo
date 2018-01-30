package com.github.mmalaquiasdev.modulo01;

public class NFDao {
    public void salvar(NotaFiscal nf) {
        String sql = "insert into notafiscal (cliente, valor)"+
                "values (?," + nf.getValorLiquido() + ")";

        System.out.println("Salvando no banco" + sql);
    }
}
