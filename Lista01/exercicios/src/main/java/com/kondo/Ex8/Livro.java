package com.kondo.Ex8;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

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
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public void emprestarLivro(){
        if (emprestado == false){
            emprestado = true;
        }
    }
    
    public void devolverLivro(){
        if (emprestado == true){
            emprestado = false;
        }
    }

    public void verificarDisponibilidade(){
        if (emprestado == true){
            System.out.println("Livro não está disponível");
        }
        else{
            System.out.println("Livro está disponível");
        }
    }
}
