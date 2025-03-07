package Exercicio04;

import java.text.DecimalFormat;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    // método construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }

    //é possível ter a sobrecarga de método (Overload) com nomes iguais, oque diferencia são os parâmetros recebidos
    public void aumentarSalario(String cargo, double percentual) {
        if (this.cargo.equalsIgnoreCase(cargo)) {
            salario += salario * percentual / 100;
        }
    }

    public void promever(String novoCargo) {
        cargo = novoCargo;
    }

    //método para retornar os dados do objeto parar impressão
    public String getDados() {
        DecimalFormat format = new DecimalFormat("0.00");
        String aux = "";
        aux += "Nome: " + nome + "\n";
        aux += "Cargo: " + cargo + "\n";
        aux += "Salário: " + format.format(salario) + "\n";
        return aux;

    }


}
