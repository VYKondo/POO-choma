package com.kondo.Ex10;

public class Filme {
    private String titulo;
    private String genero;
    private float duracao;
    private String avaliacao;

    public Filme(String titulo, String genero, float duracao, String avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public float getDuracao() {
        return duracao;
    }
    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String exibirFichaTecnica(){
        return "Título: " + titulo + "\n    Gênero: " + genero + "\n    Duração : " + duracao + "hrs \n    Avaliação: " + avaliacao.substring(0,9);
    }

    public void alterarAvaliacao(String novaAvaliacao){
        avaliacao = novaAvaliacao.substring(0,9);
    }
    
}
