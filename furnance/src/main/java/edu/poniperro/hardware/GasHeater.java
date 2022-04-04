package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.types.RoomTemperature;

public class GasHeater implements Heater {
    public GasHeater() {
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
    };
}
