package algoritmos;

import java.util.Scanner;

public class CaracterPN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = scanner.nextDouble();

        char resultado = verificarPositivoNegativo(numero);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static char verificarPositivoNegativo(double numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

}
