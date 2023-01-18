package com.study.jose.exceptions;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception e) { //Genérico
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException { //checked throw
        System.out.println("Ini do metodo2");

        throw new MinhaException("deu errado!!!");

        // System.out.println("Fim do metodo2");
    }

}
