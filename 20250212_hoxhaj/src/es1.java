import java.util.Scanner;

public class es1 {
    public static int palindrome(int num){
        int count = 0;
        while (num>0) {
            count = count * 10 + num % 10;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your number");
        int num = scan.nextInt();
        int reversedNum = palindrome(num);
        if (num == reversedNum){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("The number is not");
        }
    }
}