package com.freelance.sensor_trafico.sensorclima;

public class SensorClima {

    public TipoClima sensar() {
        int x = new java.util.Random().nextInt(3);
        switch (x) {
            case 0:
                return TipoClima.NORMAL;
            case 1:
                return TipoClima.LLUVIAS_MODERADAS;
            case 2:
                return TipoClima.LLUVIAS_TORRENCIALES;
        }
        return null;
    }

}
