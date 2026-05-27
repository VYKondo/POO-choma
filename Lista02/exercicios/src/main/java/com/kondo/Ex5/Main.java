package com.kondo.Ex5;

public class Main {
    public static void main(String[] args) {
        ISBN isbn = new ISBN("978-85-333-0227-3", "Editora Exemplo");
        Livro livro = new Livro("Aprendendo Java", "João Silva", isbn);

        System.out.println("--- Dados do Livro (Associação 1:1) ---");
        livro.exibirDadosCompletos();
    }
}
