import java.util.Arrays;
import java.util.Scanner;

public class es2 {
    public static void array(int[] myA){
        System.out.println("The array before being ordered");
        System.out.print(Arrays.toString(myA));
        Arrays.sort(myA);
        int temp = 0;
        int i2=myA.length-1;
        for (int i =0; i < (myA.length-1)/2; i++){
            temp = myA[i2];
            myA[i2] = myA[i];
            myA[i] = temp;
            i2--;
        }
        System.out.println("Ordered");
        System.out.println(Arrays.toString(myA));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] mySecond = new int[] {2,5,6,7,89,81,9};
        array(mySecond);
    }
}
