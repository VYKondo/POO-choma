package com.kondo.Ex5;

public class ISBN {
    private String codigo;
    private String editora;

    public ISBN(String codigo, String editora) {
        this.codigo = codigo;
        this.editora = editora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void exibirDados() {
        System.out.println("ISBN: " + codigo);
        System.out.println("Editora: " + editora);
    }
}
