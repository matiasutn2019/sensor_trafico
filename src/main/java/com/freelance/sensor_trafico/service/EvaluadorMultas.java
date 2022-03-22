package com.freelance.sensor_trafico.service;

import com.freelance.sensor_trafico.model.Ticket;
import com.freelance.sensor_trafico.repository.GrabadorMulta;
import com.freelance.sensor_trafico.sensorclima.TipoClima;
import com.freelance.sensor_trafico.sensorvelocidad.DatosVehiculo;
import com.freelance.sensor_trafico.sensorvelocidad.TipoVehiculo;
import java.util.UUID;

public class EvaluadorMultas {

    private GrabadorMulta grabadorMulta;

    public EvaluadorMultas(GrabadorMulta grabadorMulta) {
        this.grabadorMulta = grabadorMulta;
    }

    public void evaluar(TipoClima tc, DatosVehiculo dv) {

        //AUTO
        if(tc == TipoClima.NORMAL && dv.getTipoVehiculo() == TipoVehiculo.Auto) {
            if(dv.getVelocidadMedida() <= 130) {
                return;
            }
        }

        if(tc == TipoClima.LLUVIAS_MODERADAS && dv.getTipoVehiculo() == TipoVehiculo.Auto) {
            if(dv.getVelocidadMedida() <= 110) {
                return;
            }
        }

        if(tc == TipoClima.LLUVIAS_TORRENCIALES && dv.getTipoVehiculo() == TipoVehiculo.Auto) {
            if(dv.getVelocidadMedida() <= 90) {
                return;
            }
        }

        //MOTO
        if(tc == TipoClima.NORMAL && dv.getTipoVehiculo() == TipoVehiculo.Moto) {
            if(dv.getVelocidadMedida() <= 130) {
                return;
            }
        }

        if(tc == TipoClima.LLUVIAS_MODERADAS && dv.getTipoVehiculo() == TipoVehiculo.Moto) {
            if(dv.getVelocidadMedida() <= 110) {
                return;
            }
        }

        if(tc == TipoClima.LLUVIAS_TORRENCIALES && dv.getTipoVehiculo() == TipoVehiculo.Moto) {
            if(dv.getVelocidadMedida() <= 90) {
                return;
            }
        }

        //CAMION
        if(tc == TipoClima.NORMAL && dv.getTipoVehiculo() == TipoVehiculo.Camion) {
            if(dv.getVelocidadMedida() <= 90) {
                return;
            }
        }

        if(tc == TipoClima.LLUVIAS_MODERADAS && dv.getTipoVehiculo() == TipoVehiculo.Camion) {
            if(dv.getVelocidadMedida() <= 80) {
                return;
            }
        }

        if(tc == TipoClima.LLUVIAS_TORRENCIALES && dv.getTipoVehiculo() == TipoVehiculo.Camion) {
            if(dv.getVelocidadMedida() <= 70) {
                return;
            }
        }

        //TRACTOR
        if(tc == TipoClima.NORMAL && dv.getTipoVehiculo() == TipoVehiculo.Tractor) {
            if(dv.getVelocidadMedida() <= 60) {
                return;
            }
        }

        if(tc == TipoClima.LLUVIAS_MODERADAS && dv.getTipoVehiculo() == TipoVehiculo.Tractor) {
            if(dv.getVelocidadMedida() <= 60) {
                return;
            }
        }

        if(tc == TipoClima.LLUVIAS_TORRENCIALES && dv.getTipoVehiculo() == TipoVehiculo.Tractor) {
            if(dv.getVelocidadMedida() <= 60) {
                return;
            }
        }

        System.out.println("Se debe generar ticket");

        Ticket ticket = new Ticket(
                UUID.randomUUID().toString(),
                System.currentTimeMillis()/1000,
                dv,
                tc.name(),
                100,
                dv.getVelocidadMedida());

        grabadorMulta.grabar(ticket);
    }

}
