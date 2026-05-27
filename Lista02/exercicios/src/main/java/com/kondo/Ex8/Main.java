package com.kondo.Ex8;

public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco("Rua das Flores", 123, "Jardim Primavera", "São Paulo");
        Casa minhaCasa = new Casa("Branca", 3, end);

        System.out.println("--- Detalhes da Casa ---");
        minhaCasa.exibirCasa();
    }
}
