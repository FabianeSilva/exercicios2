package salario;

import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do salário: ");
        double SM = input.nextDouble();

        System.out.println("Informe o valor de percentual (ex: 0,10) de reajuste: ");
        double PR = input.nextDouble();

        double NS = (SM * PR) + SM;

        System.out.println("O novo salário com aumento é: " + NS);


        input.close();
    }
}
