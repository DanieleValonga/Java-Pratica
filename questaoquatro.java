package AtividadePraticaJava;

import java.util.Scanner;

public class questaoquatro {
    public static void main(String[] args) {

        float n1,n2,n3,n4,resultado;

        Scanner ler = new Scanner(System.in);

        System.out.println("\nEntre com o primeiro valor: ");
        n1 = ler.nextFloat();

        System.out.println("\nEntre com o segundo valor: ");
        n2 = ler.nextFloat();

        System.out.println("\nEntre com o terceiro valor: ");
        n3 = ler.nextFloat();

        System.out.println("\nEntre com o quarto valor: ");
        n4 = ler.nextFloat();

        resultado = (n1*n2) - (n3*n4);

        System.out.println("\nO resultado foi de: "+resultado);
    }
}
