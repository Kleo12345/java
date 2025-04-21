public class Cash implements PaymentMethod {
    @Override
    public void process() {
        System.out.println("Processing payment with Cash...");
    }
}
