package tabuleiro;

import java.math.BigInteger;

public class GraosTabuleiro {
    public static void main(String[] args) {
        int numeroQuadros = 64;
        BigInteger somaTotal = BigInteger.ZERO;

        for (int quadro = 1; quadro <= numeroQuadros; quadro++) {
            BigInteger graosQuadro = BigInteger.valueOf(2).pow(quadro - 1);
            somaTotal = somaTotal.add(graosQuadro);
        }

        System.out.println("Grãos de trigo em Tabuleiro de Xadrez:");
        System.out.println("A soma é: " + somaTotal.toString());//método toString é utilizado para converter um valor de BigInteger em uma representação legível, porém qdo o número é extremamente grande não pode ser exibido, então mantem o resultado.
    }
}
