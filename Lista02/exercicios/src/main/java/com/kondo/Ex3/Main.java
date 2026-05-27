package com.kondo.Ex3;

public class Main {
    public static void main(String[] args) {
        Motor m1 = new Motor("1.0", 60, "28218903");
        Carro c1 = new Carro("Chevrolet", "Corsa", m1);
        c1.ligarCarro();
        c1.exibirFichaTecnica();
}
}
