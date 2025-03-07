package exercicio02;

public class Disciplinas {
    String nome;
    double n1;
    double n2;


    public double calcularMedia(){
       return (n1 + n2) / 2;
    }

    public String obterStatus() {
        if(calcularMedia() >= 6)
            return "Aprovado";
        return "Reprovado";
    }
}
