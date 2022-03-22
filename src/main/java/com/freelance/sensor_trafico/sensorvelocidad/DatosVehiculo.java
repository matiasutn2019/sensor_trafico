package com.freelance.sensor_trafico.sensorvelocidad;

import com.freelance.sensor_trafico.sensorvelocidad.TipoVehiculo;


public class DatosVehiculo {

    private String patente;
    private TipoVehiculo tipoVehiculo;
    private int velocidadMedida;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getVelocidadMedida() {
        return velocidadMedida;
    }

    public void setVelocidadMedida(int velocidadMedida) {
        this.velocidadMedida = velocidadMedida;
    }

    @Override
    public String toString() {
        return
                patente + " >> " +
                tipoVehiculo + " " +
                velocidadMedida;
    }

}
