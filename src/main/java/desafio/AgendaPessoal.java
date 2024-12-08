package desafio;

import java.util.Scanner;

public class AgendaPessoal {
    private static final int MAX_CONTATOS = 20;
    private static String[] nomes = new String[MAX_CONTATOS];
    private static String[] telefones = new String[MAX_CONTATOS];
    private static int totalContatos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 99) {
            exibirMenu();

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha após o número

                switch (opcao) {
                    case 1:
                        cadastrarContato(scanner);
                        break;
                    case 2:
                        excluirContato(scanner);
                        break;
                    case 3:
                        listarContatos();
                        break;
                    case 4:
                        limparAgenda();
                        break;
                    case 99:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha novamente");
                        break;
                }
            } else {
                String entradaInvalida = scanner.nextLine();// Ler a entrada inválida
                System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\nMenu Principal");
        System.out.println("Informe a opção desejada ou 99 para sair");
        System.out.println("1 = Cadastrar novo Contato na Agenda");
        System.out.println("2 = Excluir Contato da Agenda");
        System.out.println("3 = Listar contatos da Agenda");
        System.out.println("4 = Limpar todos os Contatos");
        System.out.print("Opção: ");
    }

    public static void cadastrarContato(Scanner scanner) {
        if (totalContatos < MAX_CONTATOS) {
            System.out.print("Digite o nome do contato: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o número de telefone do contato: ");
            String telefone = scanner.nextLine();

            nomes[totalContatos] = nome;
            telefones[totalContatos] = telefone;
            totalContatos++;

            System.out.println("Contato cadastrado com sucesso.");
        } else {
            System.out.println("Agenda está cheia. Impossível cadastrar novo contato.");
        }
    }

    public static void excluirContato(Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja excluir: ");
        String nomeExcluir = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < totalContatos; i++) {
            if (nomes[i].equalsIgnoreCase(nomeExcluir)) {
                encontrado = true;
                for (int j = i; j < totalContatos - 1; j++) {
                    nomes[j] = nomes[j + 1];
                    telefones[j] = telefones[j + 1];
                }
                nomes[totalContatos - 1] = null;
                telefones[totalContatos - 1] = null;
                totalContatos--;
                System.out.println("Contato removido com sucesso.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }

    public static void listarContatos() {
        if (totalContatos == 0) {
            System.out.println("Agenda vazia.");
        } else {
            System.out.println("\nLista Contatos: ");
            for (int i = 0; i < totalContatos; i++) {
                System.out.println("Nome: " + nomes[i] + ", Telefone: " + telefones[i]);
            }
        }
    }
    public static void limparAgenda() {
        nomes = new String[MAX_CONTATOS];
        telefones = new String[MAX_CONTATOS];
        totalContatos = 0;
        System.out.println("Agenda limpa com sucesso.");
    }

}
