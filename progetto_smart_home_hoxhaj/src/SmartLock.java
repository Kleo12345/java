public class SmartLock extends SmartDevice{
    private boolean isLocked;

    public SmartLock(String deviceId, String brand, double powerConsumption, boolean isLocked) {
        super(deviceId, brand, powerConsumption);
        this.isLocked = isLocked;
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
