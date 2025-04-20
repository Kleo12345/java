import java.util.ArrayList;

public class Warehouse {
    private ArrayList <Product> productArrayList= new ArrayList<>();
    private int balance;

    public Warehouse() {
        this.balance = 1000;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void addBalance(int money){
        balance += money;
    }
}
