package negativo;

import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do número tanto positivo quanto negativo:");
        int n = input.nextInt();

        if (n<0){
            n = n * (-1);
        }

        System.out.println("O número transformado em positivo é: " + n);






        input.close();
    }
}
