package com.study.jose.threads.deadlock;

public class taskProcDb implements Runnable {
    private final PoolDeConexao pool;
    private final GerenciadorDeTransacao tx;

    public taskProcDb(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {

        synchronized (pool) {
            System.out.println("Chave do pool adquirida");
            pool.getConnection();
            synchronized (tx) {
                System.out.println("Começando a tx");
                tx.begin();
            }
        }

    }
}
