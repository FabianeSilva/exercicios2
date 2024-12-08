package algoritmos;

public class ContarLetra {
    public static void main(String[] args) {
        String frase = "frase de exemplo";
        char letra = 'e';
        int count = contarLetra(frase,letra);
        System.out.println("A letra '" + letra + "' apareceu " + count + " vezes na frase.");
    }

    public static int contarLetra(String frase, char letra) {
        int count = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                count++;
                }
            }

            return count;
        }
    }

