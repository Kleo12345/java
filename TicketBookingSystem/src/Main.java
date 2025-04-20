public class Main {
    public static void main(String[] args) {
    Theater theater = new Theater("Boh", 120);
    Thread thread1 = new Thread(new Booking(theater,20));
    thread1.run();
    Thread thread2 = new Thread(new Booking(theater,150));
    thread2.run();
    }
}