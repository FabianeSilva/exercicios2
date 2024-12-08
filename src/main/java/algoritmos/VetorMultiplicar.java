package algoritmos;

import java.util.Scanner;

public class VetorMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int[] A = new int[tamanho];
        int[] M = new int[tamanho];

        System.out.println("Informe os 10 números do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.print("Informe o valor de X: ");
        int X = scanner.nextInt();

        for (int i = 0; i < tamanho; i++) {
            M[i] = A[i] * X;
        }

        System.out.println("\nVetor M(elementos de A multiplicados por X):");
        exibirVetor(M);

        scanner.close();
    }

    public static void exibirVetor(int[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i != vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
