package com.kondo.Ex14;

public class Main {
    public static void main(String[] args) {
    Contato c1 = new Contato("Lucas", "44 9999-9999", "ra23123@uem.br");
    c1.exibirContato();
    c1.alterarTelefone("11 1111-1111");
    c1.exibirContato();
    }
}