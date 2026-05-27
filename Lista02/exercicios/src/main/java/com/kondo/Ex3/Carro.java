package com.kondo.Ex3;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;
    private Boolean ligado = false;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

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
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public void ligarCarro(){
        ligado = true;
        motor.setLigado(true);
    }

    public void exibirFichaTecnica(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        motor.exibirDados();
    }
}
