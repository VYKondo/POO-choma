package com.kondo.Ex4;

public class Main {
    public static void main(String[] args) {
        PlacaMae p1 = new PlacaMae("GeForce", "123");
        Computador c1 = new Computador("Asus", "AMD", p1);
        c1.exibirConfiguracao();
}
}
