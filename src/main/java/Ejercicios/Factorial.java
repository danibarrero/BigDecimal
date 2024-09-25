package Ejercicios;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        BigInteger n = new BigInteger("5");
        BigInteger originalN = n;
        BigInteger acumulador = BigInteger.ONE;

        while (n.compareTo(BigInteger.ZERO) != 0) {
            acumulador = acumulador.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }

        System.out.println("El factorial de " + originalN + " es: " + acumulador);
    }
}
