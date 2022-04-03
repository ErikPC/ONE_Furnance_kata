package edu.poniperro.types;

public class RoomTemperature {
    private double temperatura = 0;

    public RoomTemperature(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
