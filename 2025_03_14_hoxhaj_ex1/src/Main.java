import java.util.ArrayList;
import mypackage.Student;
public class Main {
    public static void main(String[] args) {
        ArrayList <Student> newar = new ArrayList<Student>();
        Student s = new Student("leo","doe",6.5);
        Student s2 = new Student("john","doe",4.5);
        Student s3 = new Student("lcc","doe",6.5);
        newar.add(s);
        newar.add(s2);
        newar.add(s3);
        double media=0;
        double sum=0;
        for (Student student : newar) {
            sum+= student.getGrade();
        }
        media = sum/newar.size();
        System.out.println(newar);
        System.out.println(media);
    }
}