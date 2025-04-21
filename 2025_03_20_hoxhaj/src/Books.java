import java.util.ArrayList;
import java.util.Scanner;

public class Books extends Library{
    private String title ;
    private String author;
    private String isbn;
    private int status ;
    public Books(String title, String author, String isbn, int status) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", status=" + status +
                '}';
    }

    public void statusi(Books b){
        if (b.status==1){
            Scanner scan = new Scanner(System.in);
            System.out.println("The book is avaliable");
            System.out.println("Would you like to borrow the book");
            System.out.println("Press 1 for yes and 0 for no");
            int check =scan.nextInt();
            if (check==1){
                b.setStatus(0);
            }
        }else {
            System.out.println("The book is not avaliable");
            System.out.println("Would you like to return it");
            System.out.println("Press 1 for yes and 0 for no");
            Scanner scan = new Scanner(System.in);
            int check = scan.nextInt();
            if (check==1){
                b.setStatus(1);
            }
        }

    }
}
