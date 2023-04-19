package com.study.jose.threads.deadlock;

public class Main {
    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();

        new Thread(new taskAccessDb(pool, tx)).start();
        new Thread(new taskProcDb(pool, tx)).start();

    }
}
