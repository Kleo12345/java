import java.util.List;

public class Room {
    private String roomName;
    private List <SmartDevice> smartDeviceList;

    public Room(String roomName) {
        this.roomName = roomName;
    }
    public void addDevice(SmartDevice device){
        smartDeviceList.add(device);
    }
    public void removeDevice(SmartDevice device){
        smartDeviceList.remove(device);
    }
    public void showDevices(){
        System.out.println(smartDeviceList);
    }

    public String getRoomName() {
        return roomName;
    }

    public List<SmartDevice> getSmartDeviceList() {
        return smartDeviceList;
    }
}
