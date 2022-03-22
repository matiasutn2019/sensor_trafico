package com.freelance.sensor_trafico.service;

import com.freelance.sensor_trafico.model.Ticket;
import com.freelance.sensor_trafico.repository.GrabadorMulta;

public class GrabadorMultaSql implements GrabadorMulta {

    @Override
    public void grabar(Ticket ticket) {
        System.out.println("Grabando ticket SQL");
    }
}
