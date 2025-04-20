public class Product {
    private int price;
    private int quantity;
    private String description;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product(int price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }
}
