package com.study.jose.utils.array;

import java.util.Arrays;

public class ArrayPrimitivo {

    public static void main(String[] args) {

        Integer[] idades = new Integer[5]; // Inicializa Vetor/Array.

        for (int i = 0; i < idades.length ; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
