package negativo;

import java.util.Scanner;

public class PararNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE; //Valor mínimo possível para comparação
        int menorValor = Integer.MAX_VALUE; //Valor máximo possível para comparacção

        while (true) {

            System.out.println("Digite um valor (negativo para sair): ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                break; // Sai lo loop se o valor for negativo
            }

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        if (maiorValor != Integer.MIN_VALUE) {
            System.out.println("Maior valor informado: " + maiorValor);
        }

        if (menorValor != Integer.MAX_VALUE) {
            System.out.println("Menor valor informado: " + menorValor);
        }


        scanner.close();
    }
}
