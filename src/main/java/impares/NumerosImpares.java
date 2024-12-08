package impares;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {

        int ni = 0;

        for (int i=0; i<=20; i++) {
            if ((i % 2) != 0) {
                ni = i;
            System.out.println("Os números impáres entre 1 e 20 são: " + ni);}
        }

    }
}
