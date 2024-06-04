package AtividadePraticaJava;

import java.util.Scanner;

public class questaoum {
    public static void main(String[] args) {

        float salario, abono, novoSalario;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Salário: ");
        salario = scanner.nextFloat();

        System.out.print("Digite o Abono: ");
        abono = scanner.nextFloat();

        novoSalario = salario + abono;

        System.out.printf("Novo Salário: %.2f\n", novoSalario);

        scanner.close();
    }
}
