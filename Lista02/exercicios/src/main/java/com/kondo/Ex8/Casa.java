package com.kondo.Ex8;

public class Casa {
    private String cor;
    private int quantidadeQuartos;
    private Endereco endereco;

    public Casa(String cor, int quantidadeQuartos, Endereco endereco) {
        this.cor = cor;
        this.quantidadeQuartos = quantidadeQuartos;
        this.endereco = endereco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public void setQuantidadeQuartos(int quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibirCasa() {
        System.out.println("Casa Cor: " + cor);
        System.out.println("Quartos: " + quantidadeQuartos);
        if (endereco != null) {
            endereco.exibirDados();
        } else {
            System.out.println("Endereço não informado.");
        }
    }
}
