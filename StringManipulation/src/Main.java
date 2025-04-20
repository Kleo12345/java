import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String phrase = scan.nextLine();
        //StringBuilder phrase2= new StringBuilder(phrase.toLowerCase());
        //System.out.println(phrase2);
        //phrase2.reverse();
        //System.out.println(phrase2);
        //phrase.toLowerCase().replaceAll("a","*");
        //phrase.toLowerCase().replaceAll("e","*");
        //phrase.toLowerCase().replaceAll("i","*");
        //phrase.toLowerCase().replaceAll("o","*");
        //phrase.toLowerCase().replaceAll("u","*");
        //System.out.println(phrase);
        int[] mya =new int[]{2,3,1,4};
        int[] mya2 =new int[]{2,3,1,4};
        Arrays.sort(mya);
        Arrays.sort(mya2);
        System.out.println(Arrays.toString(mya));
        int re = Arrays.binarySearch(mya,3);
        System.out.println(re);
        boolean bo = Arrays.equals(mya,mya2);
        System.out.println(bo
        );
        LinkedList<String> list = new LinkedList<>();
        list.add("BIo");
        list.add("Bo");
        ListIterator<String> iterator = list.listIterator();
        System.out.println(iterator.next());
    }
}