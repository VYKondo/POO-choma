package com.kondo.Ex6;

public class Cracha {
    private String codigo;
    private String dataValidade;

    public Cracha(String codigo, String dataValidade) {
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void exibirDados() {
        System.out.println("Código do Crachá: " + codigo);
        System.out.println("Data de Validade: " + dataValidade);
    }
}
