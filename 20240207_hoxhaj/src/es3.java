import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your a number");
        double a = scan.nextDouble();
        System.out.println("Give me your b number");
        double b =scan.nextDouble();
        System.out.println("Give me your c number");
        double c =scan.nextDouble();
        System.out.println("Give me your d number");
        double d = scan.nextDouble();
        double temp1=0;
        double temp2=0;
        temp1 = Math.max(a, c);
        temp2 = Math.min(b,d);
        if (temp1<=temp2){
            System.out.println("They have elements in common");
        }else {
            System.out.println("They do not have element in common");
        }
    }
}

