package com.kondo.Ex2;

public class Aluno {
    private String curso;
    private String nome;
    private Carterinha carterinha;
    
    public Aluno(String curso, String nome, Carterinha carterinha) {
        this.curso = curso;
        this.nome = nome;
        this.carterinha = carterinha;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Carterinha getCarterinha() {
        return carterinha;
    }
    public void setCarterinha(Carterinha carterinha) {
        this.carterinha = carterinha;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        carterinha.exibirDados();
    }
    
}
