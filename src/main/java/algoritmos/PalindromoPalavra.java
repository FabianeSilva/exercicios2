package algoritmos;

public class PalindromoPalavra {
    public static void main(String[] args) {
        String text ="radar";
        if (isPalindrome(text)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();// Convertendo a string para minúsculas para evitar problemas de caso
        int left = 0;
        int right = str.length() -1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Se o caracteres não coincidirem, não é um palíndromo
            }
            left++;
            right--;
        }
        return true; // Se o loop terminar, é um palíndromo
    }
}
