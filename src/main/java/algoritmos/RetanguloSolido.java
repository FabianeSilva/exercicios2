package algoritmos;

public class RetanguloSolido {
    public static void main(String[] args) {
        int linhas = 4;
        int colunas = 6;
        geraRetangulo(linhas, colunas);
    }

    public static void geraRetangulo(int linhas, int colunas) {
        char caractere = 'V'; //Caractere usado para preencher o retâgulo

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(caractere);
            }
            System.out.println(); // Quebra de linha após cada linha do retângulo
        }
    }
}
