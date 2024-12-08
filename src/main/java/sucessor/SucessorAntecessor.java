package sucessor;

import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o número: ");
        int n = input.nextInt();

        int ns = n + 1;
        int na = n - 1;

        System.out.println("O número sucessor é: " + ns);
        System.out.println("O número antecessor é: " + na);

        input.close();
    }
}
