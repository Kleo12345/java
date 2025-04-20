import java.util.List;

public class SmartHome {
    private String homeName;
    private List<Room> roomList ;

    public SmartHome(String homeName) {
        this.homeName = homeName;
    }
    public void addRoom(Room room){
        roomList.add(room);
    }
    public void controlAllDevices(boolean powerOn){
        if (powerOn){
            for (int i = 0;i<roomList.size(); i++) {
                if (roomList.get(i).getSmartDeviceList().get(i).isCheck()){
                    System.out.println("The device is already on");
                }else {
                    System.out.println("The device is being turned on");
                    roomList.get(i).getSmartDeviceList().get(i).setCheck(true);
                }
            }
        }else {
            for (int i = 0;i<roomList.size(); i++) {
                if (!roomList.get(i).getSmartDeviceList().get(i).isCheck()){
                    System.out.println("The device is already off");
                }else {
                    System.out.println("The device is being turned off");
                    roomList.get(i).getSmartDeviceList().get(i).setCheck(false);
                }
            }
        }
    }
    public void showHomeStatus(){
        System.out.println(roomList);
    }
}
