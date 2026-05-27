package com.kondo.Ex6;

public class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;

    public Funcionario(String nome, String cargo, Cracha cracha) {
        this.nome = nome;
        this.cargo = cargo;
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Cracha getCracha() {
        return cracha;
    }

    public void setCracha(Cracha cracha) {
        this.cracha = cracha;
    }

    public void exibirFuncionario() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
        if (cracha != null) {
            cracha.exibirDados();
        } else {
            System.out.println("Crachá não emitido.");
        }
    }
}
