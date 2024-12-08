package algoritmos;

public class NumeroPrimo {
    public static void main(String[] args) {
        int number = 17;
        if (isPrime(number)) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        if (num <= 3) {
            return true; // 2 e 3 são primos
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Números divisíveis por 2 ou 3 não são primos
        }

        // Verifica divisibilidade por numeros ímpares a partir de 5 até a raiz quadrada de num
        for (int i = 5; i * i <=num; i += 6) {
            if (num % i == 0 || (i + 2) == 0) {
                return false; // Encontrou um divisor, não é primo
            }
        }

        return true; // Se não encontrou divisores, é primo
    }
}
