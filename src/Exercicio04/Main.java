package Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Funcionario f;
        String nome, cargo;
        double salario;
        double porcentagem;

        //entrada de dados e instanciação do funcionario
        System.out.print("Nome: ");
        nome = scanner.next();

        System.out.print("Cargo: ");
        cargo = scanner.next();

        System.out.print("Salário: ");
        salario = scanner.nextDouble();

        f = new Funcionario(nome,cargo,salario);

        // aumento salário de acordo com uma porcentagem
        System.out.println("\nPorcentagem de aumento do salário");
        porcentagem = scanner.nextDouble();
        f.aumentarSalario(porcentagem);
        System.out.println("Salário R$ " + f.salario);





        scanner.close();

    }
}
