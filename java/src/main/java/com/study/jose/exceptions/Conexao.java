package com.study.jose.exceptions;

public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexão!");
        // throw new IllegalStateException("Houve um problema na conexão :(");
    }

    public void leDados() {
        System.out.println("Lendo dados!");
        throw new IllegalStateException("Houve um problema na leitura dos dados :(");
    }

//    public void termina() {
//        System.out.println("Terminando conexão!");
//    }

    @Override
    public void close() {
        System.out.println("Terminando conexão!");
    }
}
