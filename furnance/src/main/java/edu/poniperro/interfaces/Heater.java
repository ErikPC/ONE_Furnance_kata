package edu.poniperro.interfaces;

import edu.poniperro.types.RoomTemperature;

public interface Heater {
    public void on(RoomTemperature habitacion);

    public void off(RoomTemperature habitacion);
}
