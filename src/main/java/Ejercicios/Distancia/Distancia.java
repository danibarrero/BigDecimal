package Ejercicios.Distancia;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Distancia {

    private static final BigDecimal radio = new BigDecimal("6371.0");
    private static final MathContext mc = new MathContext(34, RoundingMode.HALF_UP);

    public static void main(String[] args) {
        Posicion Igualada = new Posicion(41.57879F, 1.617221F);
        Posicion Granada = new Posicion(37.176487F, -3.597929F);

        BigDecimal distancia = calculo(Igualada, Granada);
        System.out.println("La distancia es: " + distancia + " km");
    }

    public static BigDecimal calculo(Posicion p1, Posicion p2) {
        BigDecimal latitud1Rad = radianes(p1.getLatitud());
        BigDecimal longitud1Rad = radianes(p1.getLongitud());
        BigDecimal latitud2Rad = radianes(p2.getLatitud());
        BigDecimal longitud2Rad = radianes(p2.getLongitud());

        BigDecimal deltaLat = latitud2Rad.subtract(latitud1Rad, mc);
        BigDecimal deltaLon = longitud2Rad.subtract(longitud1Rad, mc);

        double a = Math.pow(Math.sin(deltaLat.doubleValue() / 2), 2) +
                Math.cos(latitud1Rad.doubleValue()) * Math.cos(latitud2Rad.doubleValue()) * Math.pow(Math.sin(deltaLon.doubleValue() / 2), 2);

        double b= 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return radio.multiply(BigDecimal.valueOf(b), mc);
    }

    private static BigDecimal radianes(BigDecimal grados) {
        BigDecimal pi = new BigDecimal(Math.PI, mc);
        return grados.multiply(pi, mc).divide(new BigDecimal("180"), mc);
    }
}
