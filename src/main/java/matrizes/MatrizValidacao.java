package matrizes;

import java.util.Scanner;

public class MatrizValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 12;
        int[] matrizA = new int [tamanho];
        int[] matrizB = new int [tamanho];

        System.out.println("Lendo Valores da Matriz A - Permitidos valores divisíveis pro 2 ou 3:");
        lerValoresValidos(matrizA, scanner, 2,3);

        System.out.println("\nLendo Valores da Matriz B - Permitidos valores múltiplos de 5:");
        lerValoresValidos(matrizB, scanner, 5, 5); // Definimos divisor2 como 1 para evitar divisão por zero

        int [] matrizC = new int[tamanho * 2];

        for (int i = 0; i < tamanho; i++) {
            matrizC[i] = matrizA[i];
            matrizC[tamanho + i] = matrizB[i];
        }

        System.out.print("\nExibindo valores da Matriz C: ");
        for (int i=0; i < matrizC.length; i++) {
            System.out.print(matrizC[i]);
            if (i != matrizC.length - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }

    public static void lerValoresValidos(int[] matriz, Scanner scanner, int divisor, int divisor2) {
        for (int i = 0; i < matriz.length; i++) {
            boolean valido = false;
            while (!valido) {
                System.out.print("Informe um valor para a matriz: ");
                int valor = scanner.nextInt();
                if (valor % divisor == 0 || valor % divisor2 == 0) {
                    matriz[i] = valor;
                    valido = true;
                } else {
                    System.out.println("Valor Inválido! Tente novamente.");
                }
            }

        }

    }
}
