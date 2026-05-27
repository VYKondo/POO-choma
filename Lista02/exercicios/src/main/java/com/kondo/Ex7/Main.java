package com.kondo.Ex7;

public class Main {
    public static void main(String[] args) {
        Prontuario p1 = new Prontuario("REG-2023-001", "O+", "Nenhuma");
        Paciente paciente = new Paciente("Carlos Eduardo", 45, p1);

        System.out.println("--- Ficha do Paciente ---");
        paciente.exibirPaciente();
    }
}
