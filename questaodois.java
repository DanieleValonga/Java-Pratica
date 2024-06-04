package AtividadePraticaJava;

import java.util.Scanner;

public class questaodois {
    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4, media;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Nota 1: ");
        nota1 = scanner.nextFloat();

        System.out.print("Digite a Nota 2: ");
        nota2 = scanner.nextFloat();

        System.out.print("Digite a Nota 3: ");
        nota3 = scanner.nextFloat();

        System.out.print("Digite a Nota 4: ");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média final: %.1f\n", media);

        scanner.close();
    }
}
