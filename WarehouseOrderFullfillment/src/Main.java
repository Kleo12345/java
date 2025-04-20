    public class Main {
        public static void main(String[] args) throws InterruptedException {
            Product mouse = new Product(20, 50, "Wireless Mouse");
            Product keyboard = new Product(120, 30, "Mechanical Keyboard");
            Product usbCable = new Product(15, 100, "USB-C Cable");
            Warehouse warehouse = new Warehouse();
            warehouse.getProductArrayList().add(mouse);
            warehouse.getProductArrayList().add(keyboard);
            warehouse.getProductArrayList().add(usbCable);
            Customer user1 = new Customer("Alice", "Smith",warehouse,30,mouse);
            Customer user2 = new Customer("Bob", "Johnson",warehouse,120,keyboard);
            Customer user3 = new Customer("Clara", "Martinez",warehouse,20,mouse);
            user2.start();
            user1.start();
            user3.start();
//            if (user1.buyProduct(mouse,20)){
//                System.out.println("Thank you for using our service");
//            }else System.out.println("There was some error");
//            if (user2.buyProduct(keyboard,120)){
//                System.out.println("Thank you for using our service");
//            }else System.out.println("There was some error");
//            if ( user3.buyProduct(mouse,20)){
//                System.out.println("Thank you for using our service");
//            }else System.out.println("There was some error");
            user2.join();
            user3.join();
            user1.join();
        }
    }