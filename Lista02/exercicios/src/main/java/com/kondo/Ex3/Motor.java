package com.kondo.Ex3;

public class Motor {
    private String tipo;
    private int potencia;
    private String numeroSerie;
    private Boolean ligado = false;
    
    public Motor(String tipo, int potencia, String numeroSerie) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.numeroSerie = numeroSerie;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
     
    public void exibirDados(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Potência: " + potencia);
        System.out.println("Número de Série: " + numeroSerie);
    }
    public Boolean getLigado() {
        return ligado;
    }
    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }
}
