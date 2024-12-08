package matrizes;

import java.util.Scanner;

public class DuasMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho = 15;

        int[] a = new int[tamanho];
        int[] b = new int[tamanho];
        int[] c = new int[tamanho * 2];

        for (int i=0; i < tamanho; i++) {
            System.out.println("Informe o valor do elemento da Matriz A: " + (i+1));
            a[i] = input.nextInt();
        }

        for (int i=0; i < tamanho; i++) {
            System.out.println("Informe o valor do elemento da Matriz B: " + (i+1));
            b[i] = input.nextInt();
        }

        for (int i=0; i < tamanho; i++) {
            c[i] = a[i];
            c[tamanho + i] = b[i];
        }

        for (int i=0; i < c.length; i++) {
            System.out.println("Valores dos Arrays A e B: " + c[i]);
        }


        input.close();
    }
}
