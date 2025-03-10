package exercicio03;

public class Ponto {
    int x;
    int y;

    public double calcularDistancia(Ponto p) {
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2)) + Math.pow(y - p.y, 2);
        return distancia;
    }

    public double calcularDistanciaAteOrigem() {
        Ponto origem = new Ponto();
        return calcularDistancia(origem);
    }

    public String formatarPonto() {
        return "(" + x+ " , " + y + ")";
    }

    // método para retornar o ponto mais proximo da origem
    public  static Ponto maisProximadaOrigem(Ponto p1, Ponto p2) {
        double dp1 = p1.calcularDistanciaAteOrigem();
        double dp2 = p2.calcularDistanciaAteOrigem();
        if(dp1 < dp2) {
            return p1;
        }
        return p2;
    }
}
