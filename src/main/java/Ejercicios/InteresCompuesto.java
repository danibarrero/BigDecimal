package Ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InteresCompuesto {

    public static void main(String[] args) {
        BigDecimal debe = new BigDecimal("10000.00");
        BigDecimal tasa = new BigDecimal("0.05");
        int anio = 5;
        int tiempo = 4;

        BigDecimal amount = calculo(debe, tasa, anio, tiempo);
        System.out.println("cantidad despues de " + anio + " años: " + amount);
    }

    public static BigDecimal calculo(BigDecimal principal, BigDecimal tasa, int anio, int tiempo) {
        BigDecimal one = BigDecimal.ONE;
        BigDecimal dividido = tasa.divide(new BigDecimal(tiempo), 10, RoundingMode.HALF_UP);
        BigDecimal exponente = new BigDecimal(tiempo * anio);

        BigDecimal base = one.add(dividido);
        BigDecimal result = principal.multiply(base.pow(exponente.intValueExact()));

        return result.setScale(2, RoundingMode.HALF_UP);
    }

    //git commit -m "*****"
    //git commit push
}
