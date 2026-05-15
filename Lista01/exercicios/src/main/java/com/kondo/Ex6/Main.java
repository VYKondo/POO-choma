package com.kondo.Ex6;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setMarca("Chevrolet");
        c1.setModelo("Corsa");
        c1.setVelocidade(4);
        c1.frear();
        c1.frear();
        c1.acelerar();
        c1.mostrarVelocidade();
    }
}