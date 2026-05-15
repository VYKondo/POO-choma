package com.kondo.Ex8;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.setAutor("George Orwell");
        l1.setEmprestado(false);
        l1.setTitulo("A Revolução dos Bixos");
        l1.verificarDisponibilidade();
        l1.emprestarLivro();
        l1.verificarDisponibilidade();
    }
}