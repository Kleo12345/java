import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your first number");
        int a = scan.nextInt();
        System.out.println("Give me your second number");
        int b = scan.nextInt();
        int sum =0;
        int sum2 =0;
        for (int i=a; i<=b ; i++){
            sum = sum +i;
        }
        System.out.println(sum);
        int n = 0;
        n = b-a;
        if (a==1){
            sum2 =(n*(n+1)/2);
        }else{
            sum2 =(b-a+1)*(a+b)/2;
        }
        System.out.println(sum2);
        if (sum == sum2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
