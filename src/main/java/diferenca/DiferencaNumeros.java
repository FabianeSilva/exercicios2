package diferenca;

import java.util.Scanner;

public class DiferencaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int n1 = input.nextInt();

        System.out.println("Informe outro número: ");
        int n2 = input.nextInt();

        int diferenca;

        if (n1 > n2) {
            diferenca = n1 - n2;
        } else {
            diferenca = n2 - n1;
        }

        System.out.println("A diferença entre o maior e o menor valor é: " + diferenca);

        input.close();
    }

}
