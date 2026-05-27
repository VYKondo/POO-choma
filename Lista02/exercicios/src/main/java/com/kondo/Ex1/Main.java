package com.kondo.Ex1;

public class Main {
    public static void main(String[] args) {
        Cpf meuCpf = new Cpf("123.456.789-00", "Regular");
        Pessoa pessoa = new Pessoa("Vinícius Kondo", 20, meuCpf);

        pessoa.exibirDados();
    }
}
