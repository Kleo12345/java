import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class es4 {
    public static void reverse(int[] ar){
        int temp = 0;
        int i2=ar.length-1;
        for (int i =0; i <= (ar.length-1)/2; i++){
            temp = ar[i2];
            ar[i2] = ar[i];
            ar[i] = temp;
            i2--;
        }

        System.out.println("After");
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) {
        int[] myAr = new int[20];
        Random rand = new Random();
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < 20) {
            int randomNum = rand.nextInt(99) + 1;
            uniqueNumbers.add(randomNum);
        }

        int in = 0;
        for (int num : uniqueNumbers) {
            myAr[in++] = num;
        }

        System.out.println("Before");
        System.out.println(Arrays.toString(myAr));
        reverse(myAr);
    }
}
