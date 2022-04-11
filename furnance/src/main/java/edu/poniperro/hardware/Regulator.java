package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;
import edu.poniperro.types.RegulatorDisplayCodes;
import edu.poniperro.types.RoomTemperature;

public class Regulator {

    public Regulator() {
    };

    public void regulate(Thermometer termometro, Heater calentador, double minTemp, double maxTemp,
            RoomTemperature temperature) {
        while (termometro.leerTemperatura(temperature) < maxTemp) {
            calentador.on(temperature);
            System.out.print(RegulatorDisplayCodes.CALOR.getAttack() + "\n");
        }

        while (termometro.leerTemperatura(temperature) > minTemp) {
            calentador.off(temperature);
            System.out.println(RegulatorDisplayCodes.FRIO.getAttack() + "\n");
        }

    };
}
