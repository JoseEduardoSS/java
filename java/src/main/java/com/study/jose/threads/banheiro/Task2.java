package com.study.jose.threads.banheiro;

public class Task2 implements Runnable{
    private Bath banheiro;

    public Task2(Bath banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.numero2();
    }
}
