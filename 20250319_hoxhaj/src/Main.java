public class Main {
    public static void main(String[] args) {
        Course cs101 = new Course("CS101", "Introduction to Programming");
        Course cs102 = new Course("CS102", "Introduction to Algorithms");

        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);
        Student charlie = new Student("Charlie", 3);

        Teacher michael = new Teacher("Michael", 101);
        Teacher frank = new Teacher("Frank", 102);
        Teacher paula = new Teacher("Paula", 103);

        cs101.addTeacher(michael);
        cs101.addTeacher(frank);
        cs102.addTeacher(paula);

        alice.enroll(cs101);
        bob.enroll(cs101);
        bob.enroll(cs102);

        System.out.println(alice);
        System.out.println();
        System.out.println(bob);
        System.out.println();
        System.out.println(charlie);
        System.out.println();
        System.out.println(cs101);
        System.out.println();
        System.out.println(cs102);
    }
}