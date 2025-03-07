package exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat("0.000");
        Scanner scanner = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();



        System.out.print("Informe as coordenadas do ponto 1: ");
        p1.x = scanner.nextInt();
        p1.y = scanner.nextInt();

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


    }
}
