package Ejercicios;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Préstamo {

    public static void main(String[] args) {
        BigDecimal principal = new BigDecimal("200000");
        BigDecimal tasa = new BigDecimal("0.05");
        int anio = 30;
        int pago = anio * 12;

        BigDecimal tasaInteresMensual = tasa.divide(new BigDecimal("12"), 10, RoundingMode.HALF_EVEN);

        BigDecimal pagoMensual = calculo(principal, tasaInteresMensual, pago);
        System.out.println("Préstamo: " + principal + "€");
        System.out.printf("Tasa de interés anual: %.2f%%\n", tasa.multiply(new BigDecimal("100")));
        System.out.printf("Pago mensual: %.2f€\n", pagoMensual);
        System.out.println("--------------------------");

        pagos(principal, tasaInteresMensual, pago, pagoMensual);
    }

    public static BigDecimal calculo(BigDecimal principal, BigDecimal tasaMensual, int totalPagos) {
        BigDecimal unoMasTasa = BigDecimal.ONE.add(tasaMensual);
        BigDecimal exponente = unoMasTasa.pow(-totalPagos, new MathContext(10));
        BigDecimal divisor = BigDecimal.ONE.subtract(exponente);
        return principal.multiply(tasaMensual).divide(divisor, 10, RoundingMode.HALF_EVEN);
    }

    public static void pagos(BigDecimal saldo, BigDecimal tasaMensual, int totalPagos, BigDecimal pagoMensual) {
        BigDecimal saldoPendiente = saldo;
        for (int i = 1; i <= totalPagos; i++) {
            BigDecimal pagoInteres = saldoPendiente.multiply(tasaMensual).setScale(10, RoundingMode.HALF_EVEN);

            BigDecimal pagoPrincipal = pagoMensual.subtract(pagoInteres).setScale(10, RoundingMode.HALF_EVEN);

            saldoPendiente = saldoPendiente.subtract(pagoPrincipal).setScale(10, RoundingMode.HALF_EVEN);

            System.out.println("Mes: " + i + " | Interés: " + pagoInteres + " | Principal: " + pagoPrincipal + " | Saldo pendiente: " + saldoPendiente);

            if (saldoPendiente.compareTo(BigDecimal.ZERO) <= 0) {
                break;
            }
        }
    }
}
