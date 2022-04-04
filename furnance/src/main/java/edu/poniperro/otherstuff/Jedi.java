package edu.poniperro.otherstuff;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.types.RoomTemperature;

public class Jedi implements Heater {
    public Jedi() {
    }

    @Override
    public void on(RoomTemperature habitacion) {
        double temperatura = 1 + habitacion.getTemperatura();
        habitacion.setTemperatura(temperatura);
    }

    @Override
    public void off(RoomTemperature habitacion) {
        double temperatura = 1 - habitacion.getTemperatura();
        habitacion.setTemperatura(temperatura);
    }

    public void speak() {
        System.out.println("\n"
                + "\t  __.-._   \n"
                + "\t  '-._\"7' \n"
                + "\t   /'.-c   \n"
                + "\t   |  /T   \n"
                + "\t  _)_/LI   \n"
                + "\nDo or do not. There is no try ");
    }
}
