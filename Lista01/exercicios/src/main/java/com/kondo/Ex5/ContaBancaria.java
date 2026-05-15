package com.kondo.Ex5;

public class ContaBancaria {
    private String numero;
    private String titular;
    private float saldo;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public void sacar(float valor){
        if (saldo >= valor){
            saldo -= valor;
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }
}
