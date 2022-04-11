package edu.poniperro.types;

public enum RegulatorDisplayCodes {
    CALOR("Saidai Netsuyou Ichiman Dou"),
    FRIO("Ice Age");

    private final String attack;

    private RegulatorDisplayCodes(String attack) {
        this.attack = attack;
    }

    public String getAttack() {
        return attack;
    }
}
