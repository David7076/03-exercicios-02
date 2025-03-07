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






    }
}
