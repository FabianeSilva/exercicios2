package nomes;

import java.util.Scanner;

public class ApresentarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[10];

        for (int i=0; i < a.length; i++) {
            System.out.println("Informe o nome" + (i+1) + ":");
            a[i] = scanner.nextLine();
        }


            System.out.println("Os nomes digitados foram: ");
            for (int i=0; i < a.length; i++) {
                System.out.println("Nome" + (i + 1) + ": " + a[i]);
            }



        scanner.close();
    }
}
