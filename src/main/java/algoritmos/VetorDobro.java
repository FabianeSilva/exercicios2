package algoritmos;

public class VetorDobro {
    public static void main(String[] args) {
        int[] V = {5, 1, 4, 2, 7, 8, 3, 6};
        int tamanho = V.length;

        int[] V2 = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            V2[i] = V[i] *2;
        }

        System.out.println("Vetor V:");
        exibirVetor(V);

        System.out.println("\nVetor V2 (dobro de cada valor de V:");
        exibirVetor(V2);
    }

    public static void exibirVetor(int[] vetor) {
        System.out.print("[");
        for (int i = 0; i <vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i != vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
