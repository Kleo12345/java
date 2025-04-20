public class Main {
    public static void main(String[] args) throws InterruptedException {
        User Bottan = new User("Denis","Bottan");
        User bo =new User("Bot", "bx");
        User bo1 = new User("bb","xsj");
        BankAccount bankAccount =new BankAccount(1000);
        ATM atm =new ATM();
        ATM atm1 = new ATM();
        ATM atm2 = new ATM();
        bankAccount.addUser(bo);
        bankAccount.addUser(Bottan);
        bankAccount.addUser(bo1);
        atm1.start();
        atm2.start();
        atm.start();
        atm.join();
        atm1.join();
        atm2.join();
        atm.operation(Bottan,bankAccount);
        atm1.operation(bo1,bankAccount);
        atm2.operation(bo,bankAccount);
        System.out.println(bankAccount.getBalance());
    }
}