package com.study.jose.exceptions;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException e) { //multicatching
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (MinhaException e) { // precisa tratar o checked throw
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException { //checked throw
        System.out.println("Ini do metodo2");

        throw new MinhaException("deu errado!!!");

        // System.out.println("Fim do metodo2");
    }

}
