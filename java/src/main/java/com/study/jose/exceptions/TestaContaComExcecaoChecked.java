package com.study.jose.exceptions;

import com.study.jose.model.ContaCorrente;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente(123, 100.0);
        try {
            c.deposita(100.0);
        } catch (MinhaException e) {
            System.out.println("Tratando exceção");
        }
    }
}
