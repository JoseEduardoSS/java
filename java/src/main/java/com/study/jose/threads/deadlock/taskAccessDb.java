package com.study.jose.threads.deadlock;

public class taskAccessDb implements Runnable {

    private final PoolDeConexao pool;
    private final GerenciadorDeTransacao tx;

    public taskAccessDb(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public synchronized void run() {
        synchronized (pool) {
            System.out.println("Pool key");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("Gerenciando tx");
                tx.begin();
            }
        }
    }
}
