package com.kondo.Ex7;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumentarSalario(float percentual){
        salario += percentual/100 * salario;
    }

    public void exibirFuncionario(){
        System.out.println("Nome: " +nome);
        System.out.println("Cargo: " +cargo);
        System.out.println("Salario: " +salario+ "R$");
    }
}
