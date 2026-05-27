package com.kondo.Ex9;

public class Main {
    public static void main(String[] args) {
        CNPJ cnpjEmpresa = new CNPJ("12.345.678/0001-99", "Ativa");
        Empresa empresa = new Empresa("Tech Solutions Ltda", "TechSol", cnpjEmpresa);

        System.out.println("--- Informações da Empresa ---");
        empresa.exibirEmpresa();
    }
}
