import java.util.Scanner;

public class es2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your number");
        int num = scan.nextInt();
        int count = 1;
        while (num>0){
            if (num/10!=0){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
