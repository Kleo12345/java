import java.util.ArrayList;

public class BankAccount {
    private double balance;
    ArrayList <User> userList= new ArrayList<>();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized boolean deposit(double amount){
        if (amount>0){
            balance += amount;
        }else {
            return false;
        }
        return true;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public synchronized boolean withdraw(double amount){
        if (amount>balance){
            return false;
        }else if (amount<0){
            return false;
        } else {
            balance -= amount;
        }
        return true;
    }
    public void addUser(User user){
        userList.add(user);
    }
}
