package com.kondo.Ex15;

public class Main {
    public static void main(String[] args) {
        LivroBiblioteca l1 = new LivroBiblioteca("The Big Brother", "George Orwell", "02312312", false);
        LivroBiblioteca l2 = new LivroBiblioteca("48 Leis do Poder", "Robert Greene", "34298909-0", true);
        LivroBiblioteca l3 = new LivroBiblioteca("A Arte da Guerra", "Sun-Tzu", "837483888-11", true);
        l1.devolver();
        l1.exibirInformacoes();
        l2.devolver();
        l2.exibirInformacoes();
        l3.emprestar();
        l3.exibirInformacoes();
    }
}