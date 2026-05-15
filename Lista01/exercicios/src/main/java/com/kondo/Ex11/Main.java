package com.kondo.Ex11;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Lucas", 65.0f, 1.73f);
        System.out.println(p1.classificarIMC());
    }
}