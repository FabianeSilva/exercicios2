package celsius;

public class GrausCelsius10 {
    public static void main(String[] args) {

        for (int grauCelsius = 10; grauCelsius <= 100; grauCelsius +=10) {
            int Fahrenheit = ((9 * grauCelsius + 160) / 5);
            System.out.println("Temperatura em Celsius: " + grauCelsius + " = " + "Temperatura em Fahrenheit: " + Fahrenheit);
        }
    }
}
