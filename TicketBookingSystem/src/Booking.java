public class Booking implements Runnable {
    private Theater theater;
    private int ticket;

    public Booking(Theater theater,int ticket ) {
        this.theater = theater;
        this.ticket = ticket;
    }

    @Override
    public void run() {
        if (theater.bookSeats(ticket)){
            System.out.println("The booking completed");
        }else System.out.println("The booking failed");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}