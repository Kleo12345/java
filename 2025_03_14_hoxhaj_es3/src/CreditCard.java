public class CreditCard implements PaymentMethod {
    @Override
    public void process() {
        System.out.println("Processing payment through Credit Card...");
    }
}
