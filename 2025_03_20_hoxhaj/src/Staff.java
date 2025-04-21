public class Staff extends Person{
    private int wage;

    public Staff(String name, String ID, String email, int wage) {
        super(name, ID, email);
        this.wage = wage;
    }
}
