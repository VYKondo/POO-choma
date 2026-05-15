package com.kondo.Ex13;

public class Main {
    public static void main(String[] args) {
        Jogador p1 = new Jogador("Hokage77", 99, 0);
        p1.adicionarPontos(901);
        System.out.println(p1.getNivel());
    }
}