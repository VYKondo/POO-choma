package com.kondo.Ex15;

public class LivroBiblioteca {
    private String titulo;
    private String autor;
    private String codigo;
    private Boolean disponivel;
    
    public LivroBiblioteca(String titulo, String autor, String codigo, Boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if (disponivel == true){
            disponivel = false;
        }
    }

    public void devolver(){
        if (disponivel == false){
            disponivel = true;
        }
    }

    public void exibirInformacoes(){
        String estado;
        if (disponivel == true){
            estado = "Disponível";
        }
        else{
            estado = "Indisponível";
        }

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Código: " + codigo);
        System.out.println("Estado: " + estado);
    }
}
