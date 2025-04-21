abstract public class Person {
    private String name;
    private String ID;
    private String email;

    public Person(String name, String ID, String email) {
        this.name = name;
        this.ID = ID;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
