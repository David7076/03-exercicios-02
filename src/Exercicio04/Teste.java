package Exercicio04;

public class Teste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];

        //instanciando 3 objetos  do tipo Funcionario
        funcionarios[0] = new Funcionario("David", "Gerente", 32000);
        funcionarios[1] = new Funcionario("Age", "Coordenador", 65000);
        funcionarios[2] = new Funcionario("Patricia", "Professor", 25000);

        //dados armazenados no vetor
        for(int i = 0;i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].getDados());
            System.out.println();
        }

        // aplicando 10% de aumento em cada salario
        for (int i = 0;i < funcionarios.length; i++) {
            funcionarios[i].aumentarSalario(10);
        }

        System.out.println();
        for (Funcionario f : funcionarios) {
            System.out.println(f.getDados());
        }




    }
}
