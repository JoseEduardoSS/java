package com.study.jose.model;

import com.study.jose.exceptions.MinhaException;

public class Conta {
    Integer numeroConta;
    Double saldo;

    public Conta(Integer numeroConta, Double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void deposita(Double valor) throws MinhaException {
        this.saldo += saldo;
    }

    public void saca(Double valor) {
        this.saldo -= valor;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public Integer getNumeroConta() {
        return this.numeroConta;
    }
}
