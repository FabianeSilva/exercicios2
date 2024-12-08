package matrizes;

import java.util.Scanner;

public class DuasMatrizes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 15;

        int[] matrizA = new int[tamanho];
        int[] matrizB = new int[tamanho];

        System.out.println("Digito os 15 elementos da matriz A:");
        for (int i=0; i < tamanho; i++) {
            matrizA[i] = scanner.nextInt();
        }

        System.out.println("Digite os 15 elementos da matriz B:");
        for (int i=0; i < tamanho; i++) {
            matrizB[i] = scanner.nextInt();
        }

        int[] matrizC = new int[tamanho * 2];

        for (int i=0; i < tamanho; i++) {
            matrizC[i] = matrizA[i];
            matrizC[tamanho + i] = matrizB[i];
        }

        System.out.println("Matriz C (junção de A e B):");
        for (int i=0; i < matrizC.length; i++) {
            System.out.println(matrizC[i]+ " ");
        }

        scanner.close();

    }
}
