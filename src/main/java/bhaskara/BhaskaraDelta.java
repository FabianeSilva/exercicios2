package bhaskara;

import java.util.Scanner;

public class BhaskaraDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();

        System.out.println("Digeito o valor de C:");
        double c = scanner.nextDouble();

        double delta= b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não há solução nos números reais");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("O valor X1 = " + x1 + "e o valor de X2 = " + x2);
        }

        scanner.close();
    }
}
