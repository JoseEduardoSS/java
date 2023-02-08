package com.study.jose.utils.array;

import com.study.jose.model.Conta;

public class ArmazenamentoContas {

    private final Conta[] contas;
    private Integer posicao;

    public ArmazenamentoContas() {
        this.contas = new Conta[10];
        this.posicao = 0;
    }

    public void add(Conta ref) {
        this.contas[this.posicao] = ref;
        this.posicao++;
    }

    public Integer getQtdElementos() {
        return posicao;
    }

    public Conta getConta(Integer posicao) {
        return this.contas[posicao];
    }
}
