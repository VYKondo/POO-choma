package com.kondo.Ex6;

public class Main {
    public static void main(String[] args) {
        Cracha c1 = new Cracha("F001", "31/12/2026");
        Funcionario f1 = new Funcionario("Alice Souza", "Desenvolvedora", c1);

        Cracha c2 = new Cracha("F002", "01/06/2027");
        Funcionario f2 = new Funcionario("Bruno Costa", "Gerente de Projetos", c2);

        System.out.println("--- Dados do Funcionário 1 ---");
        f1.exibirFuncionario();
        System.out.println("\n--- Dados do Funcionário 2 ---");
        f2.exibirFuncionario();
    }
}
