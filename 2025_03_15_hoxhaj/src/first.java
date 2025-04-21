import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line1 = scan.nextLine();
        int counter =1;
        var check = false;
        var test = line1.trim().replaceAll(" +"," ");
        char[] ar = test.toCharArray();
        for (int i = 0; i<test.length(); i++){
            if (ar[i] == ' ') counter++;
        }
        if (test.contains("informatica")) check= true;
        String test2= test;
        for (String s : Arrays.asList("a","e", "i", "o", "u")) {
            test2 = test2.replaceAll(s, "*");
        }
        String[] arr2 = test.split(" ");
        System.out.printf("The length of this string : %d", ar.length);
        System.out.println("\t");
        System.out.println("The number of words found in this line : " + counter);
        if (check){
            System.out.println("It does contain the word informatica");
        }else {
            System.out.println("It does not contain the word");
        }
        System.out.println(test2);
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            System.out.print(" ");
        }
    }
}