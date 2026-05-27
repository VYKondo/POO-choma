package com.kondo.Ex9;

public class Empresa {
    private String razaoSocial;
    private String nomeFantasia;
    private CNPJ cnpj;

    public Empresa(String razaoSocial, String nomeFantasia, CNPJ cnpj) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public CNPJ getCnpj() {
        return cnpj;
    }

    public void setCnpj(CNPJ cnpj) {
        this.cnpj = cnpj;
    }

    public void exibirEmpresa() {
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        if (cnpj != null) {
            cnpj.exibirDados();
        } else {
            System.out.println("CNPJ não cadastrado.");
        }
    }
}
