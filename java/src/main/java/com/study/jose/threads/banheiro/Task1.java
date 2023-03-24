package com.study.jose.threads.banheiro;

public class Task1 implements Runnable{
    private Bath banheiro;

    public Task1(Bath banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.numero1();
    }
}
