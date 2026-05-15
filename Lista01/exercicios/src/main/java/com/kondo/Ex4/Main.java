package com.kondo.Ex4;

public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.setAltura(20);
        r1.setBase(5);
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
    }
}