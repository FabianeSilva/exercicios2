package algoritmos;

import java.util.Scanner;

public class NomePesquisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        String[] nomes = new String[tamanho];

        System.out.println("Informe os nomes de 5 pessoas:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Nome " + (i +1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean achou = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                achou = true;
                break;
            }
        }

        if (achou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();
    }
}
