public class Light extends SmartDevice{
    private int brightnessLevel;
    private String color;

    public Light(String deviceId, String brand, double powerConsumption, int brightnessLevel, String color) {
        super(deviceId, brand, powerConsumption);
        this.brightnessLevel = brightnessLevel;
        this.color = color;
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
