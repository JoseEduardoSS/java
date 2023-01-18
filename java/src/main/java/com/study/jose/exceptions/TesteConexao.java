package com.study.jose.exceptions;

public class TesteConexao {

    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) { // try with resources - AutoCloseable
            conexao.leDados();
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

//        Conexao con = null;
//
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException e) {
//            System.out.println("Erro: " + e.getMessage());
//        } finally { // irá entrar no bloco finally sempre depois do try
//            con.termina();
//        }
    }
}
