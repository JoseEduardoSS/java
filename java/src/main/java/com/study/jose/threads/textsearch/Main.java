package com.study.jose.threads.textsearch;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final String name = "Jon";

        Thread threadAss = new Thread(new TarefaTextSearch("D:\\projetos\\java estudos\\java\\assinaturas1.txt", name));
        Thread threadAss2 = new Thread(new TarefaTextSearch("D:\\projetos\\java estudos\\java\\assinaturas2.txt", name));
        Thread threadAut = new Thread(new TarefaTextSearch("D:\\projetos\\java estudos\\java\\autores.txt", name));

        threadAss.start();
        threadAss2.start();
        threadAut.start();
    }
}
