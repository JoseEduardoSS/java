package com.study.jose.utils.array;

import com.study.jose.model.Conta;
import com.study.jose.model.ContaCorrente;

public class Teste {

    public static void main(String[] args) {
        ArmazenamentoContas armazenamentoContas = new ArmazenamentoContas();

        Conta cc = new ContaCorrente(22, 11.0);
        armazenamentoContas.add(cc);

        Conta cc2 = new ContaCorrente(33, 111.0);
        armazenamentoContas.add(cc2);

        int qtd = armazenamentoContas.getQtdElementos();

        System.out.println(qtd);

        Conta ref = armazenamentoContas.getConta(0);
        System.out.println(ref.getNumeroConta());
    }
}
