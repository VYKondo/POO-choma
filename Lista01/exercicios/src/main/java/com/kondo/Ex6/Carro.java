package com.kondo.Ex6;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public void acelerar(){
        velocidade += 5;
    }

    public void frear(){
        if (velocidade >= 5){
            velocidade -= 5;
        }
        else{
            velocidade = 0;
        }
    }

    public void mostrarVelocidade(){
        System.out.println("Velocidade (km/h) " + velocidade);
    }
}

