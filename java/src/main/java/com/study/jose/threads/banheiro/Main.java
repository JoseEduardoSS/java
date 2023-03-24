package com.study.jose.threads.banheiro;

public class Main {

    public static void main(String[] args) {

        Bath banheiro = new Bath();

        //Passando a tarefa e o nome do Thread
        Thread convidado1 = new Thread(new Task1(banheiro), "João");
        Thread convidado2 = new Thread(new Task2(banheiro), "Pedro");
        Thread limpeza = new Thread(new CleanTask(banheiro), "Tia da faxina");

        limpeza.setDaemon(true); //executa em segundo plano e não impede o encerramento da JVM quando todas as outras threads não daemon já foram encerradas.

        convidado1.start();
        convidado2.start();
        limpeza.start();
    }
}
