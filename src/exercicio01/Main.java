package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador jogador = new Jogador();


        System.out.print("Digite o nome do jogador:  ");
        jogador.nome = scanner.next();

        for (int i = 0; i < jogador.pontuacao.length; i++) {
            System.out.print("Digite a pontuação da rodada " + (i + 1) + ": ");
            jogador.pontuacao[i] = scanner.nextInt();
        }


        System.out.println("Nome --> " + jogador.nome);
        System.out.println("Pontuação final --> " + jogador.calcularPontuacao());

    }
}
