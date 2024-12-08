package decrescente;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int tamanho = 12;
     int[] vetor = new int[tamanho];

     for (int i = 0; i < tamanho; i++) {
         System.out.println("Informe o número: ");
         vetor[i] = scanner.nextInt();
     }

     Arrays.sort(vetor);
     for (int i = tamanho - 1; i >=0; i--) {
         System.out.print(vetor[i]);
         if (i != 0) {
             System.out.print(", ");
         }
     }
     System.out.println(); // Pula uma linha após a listagem dos valores

     scanner.close();
    }
}
