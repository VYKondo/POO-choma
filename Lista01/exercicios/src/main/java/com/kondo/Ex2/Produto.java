package com.kondo.Ex2;

public class Produto {
    private String nome;
    private float preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("preço " + preco);
    }
}
