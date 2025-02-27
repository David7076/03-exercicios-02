package exercicio01;

import java.util.Scanner;

public class Jogador {
    String nome;
    int[] pontuacao = new int[3];


    public int calcularPontuacao() {
        int soma = 0;
        for (int i = 0; i < pontuacao.length; i++) {
            soma += pontuacao[i];
        }
        return soma;
    }
}
