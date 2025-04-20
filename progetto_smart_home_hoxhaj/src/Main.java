public class Main {
    public static void main(String[] args) throws NoDuplicates {
        Light light = new Light("jshdsj0","boh",12.0,2,"red");
        Thermostat thermostat = new Thermostat("shdhsdb","boh",2.0,26);
        SmartLock smartLock = new SmartLock("hjsh","bhxj",3.0,true);
        Room room = new Room("Room");
        SmartHome smartHome = new SmartHome("Home1");
        smartHome.addRoom(room);
        room.addDevice(light);
        room.addDevice(thermostat);
        room.addDevice(thermostat);
        Room room1 = new Room("Room1");
        Room room2 = new Room("Room2");
        room1.addDevice(light);
        room1.addDevice(smartLock);
        room2.addDevice(thermostat);
        room2.addDevice(smartLock);
        room2.addDevice(light);
        smartHome.addRoom(room1);
        smartHome.addRoom(room2);
        smartHome.controlAllDevices(true);
        light.connectToNetwork("Boh");
        ExceptionHandling handler = new ExceptionHandling();
        try {
            handler.checkDuplicates(room1.getSmartDeviceList());
        }catch (NoDuplicates e){
            System.out.println("Duplicates found: " + e.getLocalizedMessage());
        }
        System.out.println("Updated: " + room1);
    }
}