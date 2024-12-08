package algoritmos;

import java.util.Scanner;

public class TemperaturaSemanal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diasSemana = 7;
        double[] temperaturas = new double[diasSemana];

        // Leitura das temperaturas
        for (int dia = 0; dia < diasSemana; dia++) {
            System.out.print("Informe a temperatura média do dia " + (dia + 1) + ": ");
            temperaturas[dia] = scanner.nextDouble();
        }

        // Cálculo da menor e maior temperatura
        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];
        double somaTemperaturas = temperaturas[0];

        for (int dia = 1; dia < diasSemana; dia++) {
            if (temperaturas[dia] < menorTemperatura) {
                menorTemperatura = temperaturas[dia];
            }
            if (temperaturas[dia] > maiorTemperatura) {
                maiorTemperatura = temperaturas[dia];
            }
            somaTemperaturas += temperaturas[dia];
        }

        // Cálculo da temperatura média semanal
        double temperaturaMedia = somaTemperaturas / diasSemana;

        // Contagem de dias com temperatura inferior à média semanal
        int diasInferioresMedia = 0;
        for (int dia = 0; dia < diasSemana; dia++) {
            if (temperaturas[dia] < temperaturaMedia) {
                diasInferioresMedia++;
            }
        }

        // Exibição dos reresultados
        System.out.println("Menor temperatura da semana: " + menorTemperatura);
        System.out.println("Maior temperatura da semana: " + maiorTemperatura);
        System.out.println("Temperatura média semanal: " + temperaturaMedia);
        System.out.println("Número de dias com temperatura inferio à média semanal: " + diasInferioresMedia);

        scanner.close();

    }
}
