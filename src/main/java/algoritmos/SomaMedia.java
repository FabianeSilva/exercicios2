package algoritmos;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double num3 = scanner.nextDouble();

        double soma = calcularSoma(num1, num2, num3);
        double media = calcularMedia(num1, num2, num3);

        System.out.println("A soma dos três números é: " + soma);
        System.out.println("A média dos três números é: " + media);

        scanner.close();
    }
    public static double calcularSoma(double a, double b, double c) {
        return a + b + c;
    }

    public static double calcularMedia(double a, double b, double c) {
        double soma = calcularSoma(a, b, c);
        return soma / 3;
    }
}
