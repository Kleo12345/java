import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        phrase = phrase.trim().replaceAll(" +"," ");
        System.out.println(phrase);
        phrase = phrase.replaceAll("1","-");
        phrase = phrase.replaceAll("0","-");
        phrase = phrase.replaceAll("2","-");
        phrase = phrase.replaceAll("3","-");
        phrase = phrase.replaceAll("4","-");
        phrase = phrase.replaceAll("5","-");
        phrase = phrase.replaceAll("6","-");
        phrase = phrase.replaceAll("7","-");
        phrase = phrase.replaceAll("8","-");
        phrase = phrase.replaceAll("9","-");
        if (phrase.toLowerCase().contains("palla")){
            System.out.println("The word is contained");
        }else {
            System.out.println("The word is not contained");
        }
        String test = "";
        if (phrase.length()>=40){
            test = phrase.substring(20,40);
            System.out.println(test);
        }
    }
}
