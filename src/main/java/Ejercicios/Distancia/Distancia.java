package Ejercicios.Distancia;

public class Distancia {

    public static void main(String[] args) {
        double latitudIgualada = 41.57879;
        double longitudIgualada = 1.617221;
        double latitudGranada = 37.176487;
        double longitudGranada = -3.597929;

        double distancia = calculo(latitudIgualada, longitudIgualada, latitudGranada, longitudGranada);
        System.out.println("Distancia: " + Math.round(distancia) + " km");
    }

    public static double calculo(double latitud1, double longitud1, double latitud2, double longitud2) {
        final double radio = 6378.0;

        double latitud = Math.toRadians(latitud2 - latitud1);
        double longitud = Math.toRadians(longitud2 - longitud1);

        double a = Math.pow(Math.sin(latitud / 2), 2) + Math.cos(Math.toRadians(latitud1)) *
                Math.cos(Math.toRadians(latitud2)) * Math.pow(Math.sin(longitud / 2), 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return radio * c;
    }
}
