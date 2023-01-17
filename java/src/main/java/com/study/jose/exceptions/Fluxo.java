package com.study.jose.exceptions;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException e) { //multicatching
            String msg = e.getMessage();
            System.out.println("Exception: " + msg);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            // Trouble 01
            // int a = i / 0;

            // Trouble 02
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}