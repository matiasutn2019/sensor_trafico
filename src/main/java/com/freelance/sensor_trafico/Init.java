package com.freelance.sensor_trafico;

import com.freelance.sensor_trafico.sensorclima.SensorClima;
import com.freelance.sensor_trafico.sensorvelocidad.SensorVelocidad;
import com.freelance.sensor_trafico.service.EvaluadorMultas;
import com.freelance.sensor_trafico.service.GrabadorMultaJson;
import com.freelance.sensor_trafico.service.SensorInEternum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Init implements CommandLineRunner {

    private static SensorInEternum factory() {
        return new SensorInEternum(
                    new SensorClima(),
                    new SensorVelocidad(),
                    new EvaluadorMultas(
                            new GrabadorMultaJson()
                    )
        );
    }

    @Override
    public void run(String... args) throws Exception {
        factory().sensar();

    }
}
