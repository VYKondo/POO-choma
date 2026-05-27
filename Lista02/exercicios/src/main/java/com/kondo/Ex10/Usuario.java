package com.kondo.Ex10;

public class Usuario {
    private String login;
    private String email;
    private Perfil perfil;

    public Usuario(String login, String email, Perfil perfil) {
        this.login = login;
        this.email = email;
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public void exibirUsuario() {
        System.out.println("Login: " + login);
        System.out.println("Email: " + email);
        if (perfil != null) {
            perfil.exibirDados();
        } else {
            System.out.println("Perfil não configurado.");
        }
    }
}
