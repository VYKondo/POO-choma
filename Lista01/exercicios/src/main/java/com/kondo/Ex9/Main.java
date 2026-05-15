package com.kondo.Ex9;

public class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.setMarca("Motorola");
        c1.setModelo("ChacoalhaAscende 2.0");
        c1.setNivelBateria(96);
        c1.carregar(10);
        System.out.println(c1.getNivelBateria());
        Celular c2 = new Celular();
        c2.setMarca("Motorola");
        c2.setModelo("ChacoalhaAscende 3.5");
        c2.setNivelBateria(3);
        c2.usar(10);
        System.out.println(c2.getNivelBateria());
    }
}