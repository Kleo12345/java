public class Customer extends Thread{
    private String name;
    private String surname;
    private Warehouse warehouse = new Warehouse();
    private int money;
    private Product productToBuy;

    public Customer(String name, String surname, Warehouse warehouse, int money, Product productToBuy) {
        this.name = name;
        this.surname = surname;
        this.warehouse = warehouse;
        this.money = money;
        this.productToBuy = productToBuy;
    }

    public synchronized void buyProduct(Product product, int money){
        if (warehouse.getProductArrayList().contains(product)){
            if (product.getQuantity()>0 && money>0){
                warehouse.getProductArrayList().remove(product);
                warehouse.addBalance(product.getPrice());
                product.setQuantity(-1);
                System.out.println("Yes");
            }else {
                System.out.println("no");
            }
        }else {
            System.out.println("no");
        }
    }
    @Override
    public void run() {
        buyProduct(productToBuy,money);
    }
}
