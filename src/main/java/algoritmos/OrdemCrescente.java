package algoritmos;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int[] vetor = new int[tamanho];

        System.out.println("Informe 10 números:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor); // Ordena o vetor em ordem crescente

        System.out.println("\nVetor ordenado em ordem crescente:");
        exibirVetor(vetor);

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
