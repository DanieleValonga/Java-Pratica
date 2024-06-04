package AtividadePraticaJava;

import java.util.Scanner;

public class questaotres {
    public static void main(String[] args) {

        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Salário Bruto: ");
        salarioBruto = scanner.nextFloat();

        System.out.print("Digite o Adicional Noturno: ");
        adicionalNoturno = scanner.nextFloat();

        System.out.print("Digite as Horas Extras: ");
        horasExtras = scanner.nextFloat();

        System.out.print("Digite os Descontos: ");
        descontos = scanner.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("Salário Líquido: %.2f\n", salarioLiquido);

        scanner.close();
    }
}
