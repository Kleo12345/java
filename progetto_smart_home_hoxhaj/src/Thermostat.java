public class Thermostat extends SmartDevice{
    private double temperature;

    public Thermostat(String deviceId, String brand, double powerConsumption, double temperature) {
        super(deviceId, brand, powerConsumption);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
