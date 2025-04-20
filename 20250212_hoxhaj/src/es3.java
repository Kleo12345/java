import java.util.Arrays;
import java.util.Comparator;

public class es3 {
    public static void stringaCorta(String[] myA){
     String min = Arrays.stream(myA).min(Comparator.comparing(String::length)).orElse("Not found");
     System.out.println(min);
    }
    public static void main(String[] args) {
        String[] myS= new String[] {"super", "bowl", "pen", "plant", "books","music"};
        stringaCorta(myS);
    }
}
