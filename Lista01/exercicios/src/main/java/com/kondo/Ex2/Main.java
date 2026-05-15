package com.kondo.Ex2;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Ypê");
        p1.setPreco(3.99f);
        
        Produto p2 = new Produto();
        p2.setNome("Limpol");
        p2.setPreco(6.66f);

        p1.mostrarInformacoes();
        p2.mostrarInformacoes();
    }
}