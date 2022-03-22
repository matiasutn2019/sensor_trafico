package com.freelance.sensor_trafico.service;

import com.freelance.sensor_trafico.model.Ticket;
import com.freelance.sensor_trafico.repository.GrabadorMulta;
import com.google.gson.Gson;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class GrabadorMultaJson implements GrabadorMulta {

    @Override
    public void grabar(Ticket ticket) {

        System.out.println("Grabando ticket en formato JSON");

        try {
            String nomArch = String.join("", "/tickets/", ticket.getIdTicket(), ".json");
            File arch = new File(nomArch);
            Gson gson = new Gson();
            String strJson = gson.toJson(ticket);
            System.out.println("data: " + strJson);
            FileUtils.writeStringToFile(arch, strJson, "UTF-8");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
