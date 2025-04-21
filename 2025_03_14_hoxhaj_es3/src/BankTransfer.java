public class BankTransfer implements PaymentMethod {
    @Override
    public void process() {
        System.out.println("Processing payment through Bank Transfer...");
    }
}
