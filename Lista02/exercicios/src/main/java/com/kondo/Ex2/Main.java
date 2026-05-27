package com.kondo.Ex2;

public class Main {
    public static void main(String[] args) {
        Carterinha c1 = new Carterinha("19293922", "15/07/2006");
        Aluno a1 = new Aluno("C.C", "Vinícius", c1);
        a1.exibirDados();
}
}
