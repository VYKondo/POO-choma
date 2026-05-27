package com.kondo.Ex2;

public class Carterinha {
    private String numero;
    private String dataEmissao;

    public Carterinha(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void exibirDados(){
        System.out.println("Número: " + numero);
        System.out.println("Data de Emissão: " + dataEmissao);
    }
}
