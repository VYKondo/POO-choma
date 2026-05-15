package com.kondo.Ex7;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setCargo("Estagiário");
        f1.setNome("Rodrigo");
        f1.setSalario(100f);
        f1.aumentarSalario(100);
        f1.exibirFuncionario();
    }
}