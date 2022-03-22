package com.freelance.sensor_trafico.service;

import com.freelance.sensor_trafico.sensorclima.SensorClima;
import com.freelance.sensor_trafico.sensorclima.TipoClima;
import com.freelance.sensor_trafico.sensorvelocidad.DatosVehiculo;
import com.freelance.sensor_trafico.sensorvelocidad.SensorVelocidad;

public class SensorInEternum {

    private SensorClima sensorClima;

    private SensorVelocidad sensorVelocidad;

    private EvaluadorMultas evaluadorMultas;

    public SensorInEternum(SensorClima sensorClima,
            SensorVelocidad sensorVelocidad,
            EvaluadorMultas evaluadorMultas) {
        this.sensorClima = sensorClima;
        this.sensorVelocidad = sensorVelocidad;
        this.evaluadorMultas = evaluadorMultas;
    }

    public void sensar() {
        TipoClima tipoClima = sensorClima.sensar();
        System.out.println(tipoClima);

        for (;;) {
            DatosVehiculo datosVehiculo = sensorVelocidad.sensarVehiculo();
            System.out.println(datosVehiculo);
            evaluadorMultas.evaluar(tipoClima, datosVehiculo);
        }
    }

}
