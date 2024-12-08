package classes;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João da Silva");
        p1.setIdade(10);

        // Fazer aniversário do João
        p1.fazAniversario();    // 11
        p1.fazAniversario();    // 12
        p1.fazAniversario();    // 13

        System.out.println("Nome da Pessoa: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}
