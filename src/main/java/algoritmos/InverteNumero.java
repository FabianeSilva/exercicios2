package algoritmos;

public class InverteNumero {
    public static void main(String[] args) {
        int numero = 12345;
        int inverso = inverterNumero(numero);
        System.out.println("O inverso de " + numero + " é " + inverso);
    }

    public static int inverterNumero(int num) {
        int inverso = 0;

        while (num != 0) {
            int digito = num % 10; // Pega o último dígito
            inverso = inverso * 10 + digito; // Adiciona o dígito ao inverso
            num /= 10; // Remove o último dígito do número original
        }

        return inverso;
    }
}
