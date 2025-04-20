import java.util.List;

public class ExceptionHandling {
    public void checkDuplicates(List <SmartDevice> roomList)throws NoDuplicates {
        for (int i = 0; i < roomList.size(); i++) {
            SmartDevice checkRoom = roomList.get(i);

            for (int j = roomList.size() - 1; j > i; j--) {
                if (roomList.get(j).equals(checkRoom)) {
                    roomList.remove(j);
                    throw new NoDuplicates("There is a duplicate device in the List: " + checkRoom);
                }
            }
        System.out.println("The list has no duplicates");
        }
    }
}
