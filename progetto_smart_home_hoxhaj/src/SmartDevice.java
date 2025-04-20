public class SmartDevice implements Connectable{
    private String deviceId;
    private String brand;
    private double powerConsumption;
    private boolean check;

    public SmartDevice(String deviceId, String brand, double powerConsumptiom) {
        this.deviceId = deviceId;
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        check = false;
    }

    public void turnOn(){
        System.out.println("Turned on");
        setCheck(true);
    }
    public void turnOff(){
        System.out.println("Turned off");
        setCheck(false);
    }
    public double getPowerUsage(int hours){
        return powerConsumption * hours;
    }

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Connecting to the network: "+ networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Disconnected from the network");
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public boolean isCheck() {
        return check;
    }
}
