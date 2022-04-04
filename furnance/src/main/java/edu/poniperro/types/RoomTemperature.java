package edu.poniperro.types;

public class RoomTemperature {
    private double temperatura = 0;
    private static RoomTemperature instance = null;

    public RoomTemperature() {
    };

    public RoomTemperature(double temperatura) {
        this.temperatura = temperatura;
    }

    public static RoomTemperature getInstance() {
        if (instance == null) {
            instance = new RoomTemperature();
        }
        return instance;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
