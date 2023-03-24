package com.study.jose.threads.banheiro;

public class CleanTask implements Runnable {
    private Bath banheiro;

    public CleanTask(Bath banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        while(true) {
            banheiro.clean();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
