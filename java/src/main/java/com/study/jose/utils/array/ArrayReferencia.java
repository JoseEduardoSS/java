package com.study.jose.utils.array;

import com.study.jose.model.Conta;
import com.study.jose.model.ContaCorrente;
import com.study.jose.model.ContaPoupanca;

public class ArrayReferencia {

    public static void main(String[] args) {

        Object[] refs = new Object[5]; //Tipo genérico
        refs[0] = new ContaCorrente(123, 100.0);
        refs[1] = new ContaPoupanca(456, 500.0);

        ContaPoupanca ref1 = (ContaPoupanca) refs[1]; //Type cast
        ContaCorrente ref2 = (ContaCorrente) refs[0]; //Type cast

        System.out.println("Número da conta poupança: " + ref1.getNumeroConta() + ". Saldo: R$ " + ref1.getSaldo());
        System.out.println("Número da conta corrente: " + ref2.getNumeroConta() + ". Saldo: R$ " + ref2.getSaldo());
    }
}
