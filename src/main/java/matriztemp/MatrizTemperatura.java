package matriztemp;

import java.util.Scanner;

public class MatrizTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 20;
        double [] matrizA = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe um valor para temperatura " + (i +1) + " em ºC: ");
            matrizA[i] = scanner.nextDouble();
        }

        double maiorTemp = matrizA[0];
        double menorTemp = matrizA[0];
        double somaTemp = matrizA[0];

        for (int i = 1; i < tamanho; i++) {
            if (matrizA[i] > maiorTemp) {
                maiorTemp = matrizA[i];
            }

            if (matrizA[i] < menorTemp) {
                menorTemp = matrizA[i];
            }

            somaTemp += matrizA[i];
        }

        double mediaTemp = somaTemp / tamanho;

        System.out.println("\nA maior temperatura lida foi: " + maiorTemp + " ºC");
        System.out.println("A menor temperatura lida foi: " + menorTemp + " ºC");
        System.out.println("A média das temperaturas lidas foi: " + mediaTemp + " ºC");


        scanner.close();
    }
}
