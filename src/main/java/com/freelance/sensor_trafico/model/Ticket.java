package com.freelance.sensor_trafico.model;

import com.freelance.sensor_trafico.sensorvelocidad.DatosVehiculo;

public class Ticket {

    private String idTicket;

    private Long fechaYhora;

    private DatosVehiculo datosVehiculo;

    private String situacionClimatologica;

    private Integer limiteVelocidadPermitida;

    private Integer limiteMedido;

    public Ticket(){}

    public Ticket(String idTicket, Long fechaYhora,
            DatosVehiculo datosVehiculo, String situacionClimatologica,
            Integer limiteVelocidadPermitida, Integer limiteMedido) {
        this.idTicket = idTicket;
        this.fechaYhora = fechaYhora;
        this.datosVehiculo = datosVehiculo;
        this.situacionClimatologica = situacionClimatologica;
        this.limiteVelocidadPermitida = limiteVelocidadPermitida;
        this.limiteMedido = limiteMedido;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setId(String idTicket) {
        this.idTicket = idTicket;
    }

    public Long getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(Long fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public DatosVehiculo getDatosVehiculo() {
        return datosVehiculo;
    }

    public void setDatosVehiculo(DatosVehiculo datosVehiculo) {
        this.datosVehiculo = datosVehiculo;
    }

    public String getSituacionClimatologica() {
        return situacionClimatologica;
    }

    public void setSituacionClimatologica(String situacionClimatologica) {
        this.situacionClimatologica = situacionClimatologica;
    }

    public Integer getLimiteVelocidadPermitida() {
        return limiteVelocidadPermitida;
    }

    public void setLimiteVelocidadPermitida(Integer limiteVelocidadPermitida) {
        this.limiteVelocidadPermitida = limiteVelocidadPermitida;
    }

    public Integer getLimiteMedido() {
        return limiteMedido;
    }

    public void setLimiteMedido(Integer limiteMedido) {
        this.limiteMedido = limiteMedido;
    }
}
