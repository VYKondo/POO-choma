package com.kondo.Ex5;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumero("999");
        c1.setSaldo(12.73f);
        c1.setTitular("Vinícius");
        c1.depositar(20.0f);
        c1.consultarSaldo();
        c1.sacar(10.0f);
        c1.consultarSaldo();
    }
}