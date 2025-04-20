public class Theater {
    private String name;
    private int seats;

    public Theater(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }
    public synchronized boolean bookSeats(int num){
        if (num < seats){
            seats -=num;
            return true;
        }else {
            System.out.println("There are not enough seats, this are the seats avaliable: "+ seats);
            return false;
        }
    }
}
