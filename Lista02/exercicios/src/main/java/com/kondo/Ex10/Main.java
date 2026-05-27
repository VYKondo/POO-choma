package com.kondo.Ex10;

public class Main {
    public static void main(String[] args) {
        Perfil meuPerfil = new Perfil("Entusiasta de Java", "avatar.png", "Público");
        Usuario usuario = new Usuario("kondo_dev", "vinicius@email.com", meuPerfil);

        System.out.println("--- Perfil de Usuário ---");
        usuario.exibirUsuario();
    }
}
