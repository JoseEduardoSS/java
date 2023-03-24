package com.study.jose.threads.banheiro;

public class Bath {

    private Boolean dirty = true;

    public void numero1() {
        //Quando o synchronized for um bloco que preencha o método inteiro, o synchronized
        // pode ser colocado na declaração do metodo depois do public.
        String nome = Thread.currentThread().getName();

        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");

            while (dirty) {
                waitOutside(nome);
            }

            System.out.println(nome + " fazendo coisa rapida");

            sleep(5000L);

            this.dirty = true;

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
        }
    }

    public void numero2() {
        String nome = Thread.currentThread().getName();

        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");

            while (dirty) {
                waitOutside(nome);
            }

            System.out.println(nome + " fazendo coisa demorada");

            sleep(10000L);

            this.dirty = true;

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
        }
    }

    private static void sleep(Long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clean() {

        String nome = Thread.currentThread().getName();

        synchronized (this) {

            System.out.println(nome + " entrando no banheiro");

            if (!this.dirty) {
                System.out.println(nome + ", não está sujo, vou sair");
                return;
            }

            System.out.println(nome + " limpando o banheiro");
            this.dirty = false;

            try {
                Thread.sleep(13000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.notifyAll();

            System.out.println(nome + " saindo do banheiro");
        }

    }

    private void waitOutside(String nome) {
        System.out.println(nome + " eca, o banheiro está sujo");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
