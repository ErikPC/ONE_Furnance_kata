package edu.poniperro.types;

import edu.poniperro.interfaces.Thermometer;

public class RemoteCommandSensor implements Thermometer {

    public RemoteCommandSensor() {
    };

    public double leerTemperatura(RoomTemperature temperature) {
        return temperature.getTemperatura();
    };

}
