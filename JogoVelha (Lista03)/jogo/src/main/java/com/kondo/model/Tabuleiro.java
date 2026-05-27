package com.kondo.model;

import com.kondo.exception.JogadaInvalidaException;

public class Tabuleiro {
    private Simbolo[][] grade;

    public Tabuleiro() {
        grade = new Simbolo[3][3];
    }

    public void registrarJogada(int linha, int coluna, Simbolo simbolo) throws JogadaInvalidaException {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            throw new JogadaInvalidaException("Posicao fora do intervalo valido.");
        }
        if (grade[linha][coluna] != null) {
            throw new JogadaInvalidaException("Posicao ja ocupada.");
        }
        grade[linha][coluna] = simbolo;
    }

    public boolean verificarVitoria(Simbolo simbolo) {
        for (int i = 0; i < 3; i++) {
            if (grade[i][0] == simbolo && grade[i][1] == simbolo && grade[i][2] == simbolo) return true;
            if (grade[0][i] == simbolo && grade[1][i] == simbolo && grade[2][i] == simbolo) return true;
        }
        if (grade[0][0] == simbolo && grade[1][1] == simbolo && grade[2][2] == simbolo) return true;
        if (grade[0][2] == simbolo && grade[1][1] == simbolo && grade[2][0] == simbolo) return true;
        return false;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grade[i][j] == null) return false;
            }
        }
        return true;
    }

    public Simbolo[][] getGrade() {
        return grade;
    }
}
