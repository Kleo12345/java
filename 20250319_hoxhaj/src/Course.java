import java.util.ArrayList;

public class Course {
    private String code;
    private String name;
    private ArrayList <Student> listStudent = new ArrayList<>();
    private ArrayList <Teacher> listTeacher = new ArrayList<>();
    public void addStudent(Student s){
        listStudent.add(s);
    }
    public void addTeacher(Teacher t){
        listTeacher.add(t);
    }
    public void removeStudent(Student s ){
        listStudent.remove(s);
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", listStudent=" + listStudent +
                ", listTeacher=" + listTeacher +
                '}';
    }

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
