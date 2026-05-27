package com.kondo.Ex7;

public class Paciente {
    private String nome;
    private int idade;
    private Prontuario prontuario;

    public Paciente(String nome, int idade, Prontuario prontuario) {
        this.nome = nome;
        this.idade = idade;
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public void exibirPaciente() {
        System.out.println("Paciente: " + nome);
        System.out.println("Idade: " + idade + " anos");
        if (prontuario != null) {
            prontuario.exibirDados();
        } else {
            System.out.println("Prontuário não disponível.");
        }
    }
}
