package com.study.jose.utils.list;

import com.study.jose.model.Conta;
import com.study.jose.model.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {

        List<Conta> list = new LinkedList<>();

        Conta cc = new ContaCorrente(22, 11.0);
        list.add(cc);

        Conta cc2 = new ContaCorrente(123, 312.0);
        list.add(cc2);

        System.out.println(list.size());

        for (Conta conta : list) {
            System.out.println("Numero da conta: " + conta.getNumeroConta()
                    + "\nSaldo: " + conta.getSaldo()
                    + "\n##############");
        }
    }
}
