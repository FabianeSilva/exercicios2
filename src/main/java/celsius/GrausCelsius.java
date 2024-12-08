package celsius;

import java.util.Scanner;

public class GrausCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor do Grau Celsius: ");
        int grauCelsius = input.nextInt();

        int Fahrenheit = ((9 * grauCelsius + 160)/5);

        System.out.println("A temperatura convertida em Fahrenheit é: " + Fahrenheit);


        input.close();

    }

}
