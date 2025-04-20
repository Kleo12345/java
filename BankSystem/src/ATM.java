import java.util.Random;

public class ATM extends Thread{
    public synchronized void operation(User user,BankAccount bankAccount){
        if (bankAccount.getUserList().contains(user)){
            Random random = new Random();
            int check = random.nextInt(1,3);
            if (check ==1){
                double amount = 100;//random.nextDouble()*100.0;
                if (bankAccount.deposit(amount)){
                    System.out.println("The deposit was successful");
                }else if (!bankAccount.deposit(amount)){
                    System.out.println("The deposit was not successful");
                }
            } else if (check == 2) {
                double amount = 100;//random.nextDouble()*100.0;
                if (bankAccount.withdraw(amount)){
                    System.out.println("The withdraw was successful");
                }else if (!bankAccount.withdraw(amount)){
                    System.out.println("The withdraw was not successful");
                }
            }
        }else {
            System.out.println("This user does not belong to this bank account");
        }
    }

    @Override
    public void run() {
        super.run();
    }
}
