package com.kondo.Ex10;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme("A Nova Onda do Imperador", "Animação", 1.6f, "Divertido e bem animado");
        System.out.println(f1.exibirFichaTecnica());
        f1.alterarAvaliacao("Uma bostaaaa");
        System.out.println(f1.exibirFichaTecnica());
        
    }
}