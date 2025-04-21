import java.awt.print.Book;
import java.util.ArrayList;

public class Member extends Person implements Borrowable{
    private ArrayList <Books> list = new ArrayList<>();

    public Member(String name, String ID, String email) {
        super(name, ID, email);
    }

    @Override
    public void borrowBook(Books books) {
        if (list.size()>5) {
            System.out.println("You cannot borrow any other book because you have surpassed the limit");
        }else {
            list.add(books);
        }
    }

    @Override
    public void returnBook(Books books) {
        list.remove(books);
    }

    @Override
    public String toString() {
        return "Member{" +
                "list=" + list +
                '}';
    }
}
