package com.kondo.Ex13;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void adicionarPontos(int valor){
        int niveis = (pontuacao % 100) + valor;
        pontuacao += valor;
        subirNivel(niveis/100);
    }

    public void subirNivel(int quantniveis){
        nivel += quantniveis;
    }
}
