package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        Disciplinas disciplina1 = new Disciplinas();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.next();

        System.out.print("Digite o RM:  ");
        aluno.rm = scanner.nextInt();

        aluno.disciplinas1 = new Disciplinas();
        System.out.print("Digite a disciplina do Aluno: ");
        aluno.disciplinas1.nome = scanner.next();


        System.out.println("Disciplina --> " + aluno.disciplinas1.nome);
        System.out.print("Nota 1 -->  ");
        aluno.disciplinas1.n1 = scanner.nextDouble();


        System.out.print("Nota 2 -->  ");
        aluno.disciplinas1.n2 = scanner.nextDouble();

        double media = aluno.disciplinas1.calcularMedia();
        System.out.println("Media: " + media);
        System.out.println("Situação: " + aluno.disciplinas1.obterStatus());




<<<<<<< HEAD
=======
        System.out.print("Informe as coordendas do ponto 2: ");
        p2.x = scanner.nextInt();
        p2.y = scanner.nextInt();


        System.out.println("Distancia do p1 para o p2: " + format.format(p1.calcularDistancia(p2)));

        // impressao da distancia de cada ponto ate a origem
        System.out.print("Distancia do p1 ate a origem: " + format.format(p1.calcularDistanciaAteOrigem()));

        // impressao do ponto mais proximo da origem
        System.out.println();
        Ponto aux = Ponto.maisProximadaOrigem(p1,p2);
        System.out.println("Ponto mais proximo: " + aux.formatarPonto());
>>>>>>> 991678efef9b7f082e02ca249ab693011e1ac558


    }
}
