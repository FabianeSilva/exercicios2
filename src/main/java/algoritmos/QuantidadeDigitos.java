package algoritmos;

public class QuantidadeDigitos {
    public static void main(String[] args) {
        int number = 12345;
        int digitCount = countDigits(number);
        System.out.println("O numero " + number + " possui " + digitCount + " dígitos.");
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;// Um único dígito, que é o 0
        }

        int count = 0;
        while (num != 0) {
            num /=10; // Remove o último dígito
            count++;
        }
        return count;
    }
}
