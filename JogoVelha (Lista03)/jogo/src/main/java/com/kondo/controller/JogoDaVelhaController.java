package com.kondo.controller;

import com.kondo.model.*;
import com.kondo.exception.JogadaInvalidaException;

public class JogoDaVelhaController {
    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;
    private StatusPartida status;

    public JogoDaVelhaController(String nome1, String nome2) {
        this.tabuleiro = new Tabuleiro();
        this.jogador1 = new Jogador(nome1, Simbolo.X);
        this.jogador2 = new Jogador(nome2, Simbolo.O);
        this.jogadorAtual = jogador1;
        this.status = StatusPartida.EM_ANDAMENTO;
    }

    public void realizarJogada(int linha, int coluna) throws JogadaInvalidaException {
        if (status != StatusPartida.EM_ANDAMENTO) {
            throw new JogadaInvalidaException("A partida ja foi encerrada.");
        }

        tabuleiro.registrarJogada(linha, coluna, jogadorAtual.getSimbolo());

        if (tabuleiro.verificarVitoria(jogadorAtual.getSimbolo())) {
            status = StatusPartida.VITORIA;
        } else if (tabuleiro.verificarEmpate()) {
            status = StatusPartida.EMPATE;
        } else {
            alternarTurno();
        }
    }

    private void alternarTurno() {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }
}
