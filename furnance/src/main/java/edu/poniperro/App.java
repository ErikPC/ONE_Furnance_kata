package edu.poniperro;

import edu.poniperro.hardware.GasHeater;
import edu.poniperro.hardware.Regulator;
import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;
// import edu.poniperro.otherstuff.Jedi;
import edu.poniperro.otherstuff.Pirate;
import edu.poniperro.types.RemoteCommandSensor;
import edu.poniperro.types.RoomTemperature;

public class App {
    public static void main(String[] args) {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator();

        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        // Jedi yoda = new Jedi();
        // System.out.println("\nArrancando a Yoda: ");
        // regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        // yoda.speak();

        Pirate accino = new Pirate();
        System.out.println("\nArrancando usuario de Atsu Atsu no mi:");
        regulator.regulate(thermometer, accino, minTemp, maxTemp, temperature);
        accino.speak();
    }
}