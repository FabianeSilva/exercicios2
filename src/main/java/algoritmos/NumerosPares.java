package algoritmos;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int[] Q = new int [tamanho];

        System.out.println("Informe 10 números pares para o vetor Q:");
        for (int i = 0; i < tamanho; i++) {
            while (true) {
                System.out.print("Número " + (i +1) + ": ");
                int numero = scanner.nextInt();
                if (numero % 2 ==0) {
                    Q[i] = numero;
                    break;
                } else {
                    System.out.println("Número inválido. Digite um número par.");
                }
            }
        }

        int maiorElemento = Q[0];
        int posicaoMaior = 0;

        for (int i = 1; i < tamanho; i++) {
            if (Q[i] > maiorElemento) {
                maiorElemento = Q[i];
                posicaoMaior = i;
            }
        }

        System.out.println("O maior elemento de Q é: " + maiorElemento);
        System.out.println("Ele está na posição: " + (posicaoMaior + 1));

        scanner.close();
    }
}
