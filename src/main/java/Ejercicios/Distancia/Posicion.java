package Ejercicios.Distancia;

import java.math.BigDecimal;

public class Posicion {

    private BigDecimal latitud;
    private BigDecimal longitud;

    public Posicion(float latitud, float longitud) {
        this.latitud = BigDecimal.valueOf(latitud);
        this.longitud = BigDecimal.valueOf(longitud);
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

}
