import java.util.ArrayList;

public class Teacher extends Person{
    private ArrayList<Course> list = new ArrayList<>();

    public Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "list=" + list +
                '}';
    }
}
