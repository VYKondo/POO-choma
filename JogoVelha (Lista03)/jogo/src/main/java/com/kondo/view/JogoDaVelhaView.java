package com.kondo.view;

import com.kondo.controller.JogoDaVelhaController;
import com.kondo.exception.JogadaInvalidaException;
import com.kondo.model.Simbolo;
import com.kondo.model.StatusPartida;

import java.util.Scanner;

public class JogoDaVelhaView {
    private JogoDaVelhaController controller;
    private Scanner scanner;

    public JogoDaVelhaView() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao Jogo da Velha!");
        System.out.print("Nome do Jogador 1 (X): ");
        String nome1 = scanner.nextLine();
        System.out.print("Nome do Jogador 2 (O): ");
        String nome2 = scanner.nextLine();

        controller = new JogoDaVelhaController(nome1, nome2);

        while (controller.getStatus() == StatusPartida.EM_ANDAMENTO) {
            exibirTabuleiro();
            System.out.println("Turno de: " + controller.getJogadorAtual().getNome());
            
            try {
                System.out.print("Informa a linha (0-2): ");
                int linha = Integer.parseInt(scanner.nextLine());
                System.out.print("Informa a coluna (0-2): ");
                int coluna = Integer.parseInt(scanner.nextLine());

                controller.realizarJogada(linha, coluna);
            } catch (JogadaInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada invalida. Digite numeros.");
            }
        }

        exibirTabuleiro();
        exibirResultadoFinal();
    }

    private void exibirTabuleiro() {
        Simbolo[][] grade = controller.getTabuleiro().getGrade();
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                String s = (grade[i][j] == null) ? "." : grade[i][j].toString();
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void exibirResultadoFinal() {
        if (controller.getStatus() == StatusPartida.VITORIA) {
            System.out.println("Parabens! O jogador " + controller.getJogadorAtual().getNome() + " venceu!");
        } else {
            System.out.println("O jogo terminou em EMPATE!");
        }
    }
}
