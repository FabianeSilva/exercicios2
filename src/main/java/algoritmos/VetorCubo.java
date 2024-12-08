package algoritmos;

public class VetorCubo {
    public static void main(String[] args) {
        int tamanho = 8;

        int[] V = new int[tamanho];
        int[] V2 = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            V[i] = i * i *i;
        }

        for (int i = 0; i < tamanho; i++) {
            V2[i] = V[i] * 2;
        }

        System.out.println("Vetor V (cubos dos índices):");
        exibirVetor(V);

        System.out.println("\nVetor V2 (dobro de cada valor de V)");
        exibirVetor(V2);
        }

        public static void exibirVetor(int[] vetor) {
            System.out.print("[");
            for (int i =0; i < vetor.length; i++) {
                System.out.print(vetor[i]);
                if (i != vetor.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
}
