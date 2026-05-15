package com.kondo.Ex11;

public class Paciente {
    private String nome;
    private float peso;
    private float altura;

    public Paciente(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularIMC(){
        float imc = peso /(altura * altura);
        return imc;
    }

    public String classificarIMC(){
        float imc = calcularIMC();
        if (imc < 18.5){
            return "Baixo peso";
        }
        else if(imc >= 18.5 && imc < 25.0){
            return "Peso ideal";
        }
        else if(imc >= 25.0 && imc < 30.0){
            return "Sobrepeso";
        }
        else if (imc >= 30.0 && imc < 35.0){
            return "Obsesidade I";
        }
        else if (imc >= 35.0 && imc < 40.0){
            return "Obesidade II";
        }
        else {
            return "Obesidade III";
        }
    }
}
