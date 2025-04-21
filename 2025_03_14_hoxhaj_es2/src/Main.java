import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Library> ar = new ArrayList<Library>();
        Book b1 = new Book("idkl",1999,"idk");
        Book b2 = new Book("idk2",1998,"idk3");
        Magazine m1 = new Magazine("idk3",1997,22);
        Magazine m2 = new Magazine("idk4",1996,32);
        ar.add(b1);
        ar.add(b2);
        ar.add(m1);
        ar.add(m2);
        System.out.println(ar);
    }
}