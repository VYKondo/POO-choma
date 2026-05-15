package com.kondo.Ex3;

public class Aluno {
    
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;

    public Aluno(String nome, String matricula, float nota1, float nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
 
    public float calcularMedia(){
        float media = (nota1 + nota2) / 2;
        return media;
    }

    public void verificarSituacao(){
        if (calcularMedia() >= 7.0) {
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }
}
