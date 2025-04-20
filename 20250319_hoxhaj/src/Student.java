import java.util.ArrayList;

public class Student extends Person implements Enrollable{
    private ArrayList<Course> list = new ArrayList<>();

    public Student(String name, int id) {
        super(name, id);
    }


    @Override
    public void enroll(Course course) {
        list.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "list=" + list +
                '}';
    }

    @Override
    public void drop(Course course) {
        list.remove(course);
    }
}
