import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;

public class es4 {
    public static void main(String[] args) {
        Vector<Integer> randomNumbers = new Vector<>();
        Vector<Integer> numbers = new Vector<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 99;
        int randomInt =0;
        for (int i = min; max>=i;i++){
            numbers.add(i);
        }
        for (int i = 0; 20>=i ;i++){
            randomInt=rand.nextInt(numbers.size());
            randomNumbers.add(randomInt);
        }
        System.out.println(randomNumbers);
        System.out.println("Give me the number you are searching for");
        int num2 = scan.nextInt();
        Collections.sort(randomNumbers);
        System.out.println("Sorted vector: ");
        System.out.println(randomNumbers);
        int position = Collections.binarySearch(randomNumbers,num2);
        if (position !=-1){
            System.out.println("The number " + num2 +" is found at position: "+position);
        }else {
            System.out.println("The number " + num2 + " was not found");
        }
    }
}
