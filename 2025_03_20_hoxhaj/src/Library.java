import java.util.ArrayList;

public class Library {
    private ArrayList <Books> listOfBooks = new ArrayList<>();
    private ArrayList <Member> listOfMembers = new ArrayList<>();
    private ArrayList <Staff> listOfStaff = new ArrayList<>();

    public void addBook(Books book){
        listOfBooks.add(book);
    }
    public void addMember(Member member){
        listOfMembers.add(member);
    }
    public void addStaff(Staff staff){
        listOfStaff.add(staff);
    }

    @Override
    public String toString() {
        return "Library{" +
                "listOfBooks=" + listOfBooks +
                ", listOfMembers=" + listOfMembers +
                ", listOfStaff=" + listOfStaff +
                '}';
    }
}
