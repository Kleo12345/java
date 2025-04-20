import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String surname = scan.nextLine();
        char[] special = new char[]{'@','#','$','%'};
        Random rand = new Random();
        int max = 3;
        int min = 0;
        int random = rand.nextInt(max-min+1)+min;
        String nameUpperCase = name.toUpperCase(Locale.ROOT);
        String surnameLowerCase = surname.toLowerCase(Locale.ROOT);
        int sum = name.length()+surname.length()-1;
        char specialChar = special[random];
        var name2 = nameUpperCase.trim().substring(0,3);
        var surname2 = surnameLowerCase.trim().substring(surnameLowerCase.length()-2);
        var code  = name2+surname2+sum+specialChar;
        System.out.println(code);
    }
}
