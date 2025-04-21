import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PaymentMethod> payments = new ArrayList<>();

        payments.add(new CreditCard());
        payments.add(new BankTransfer());
        payments.add(new Cash());

        for (PaymentMethod payment : payments) {
            payment.process();
        }
    }
}
