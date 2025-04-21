public class Main {
    public static void main(String[] args) {
        Books b = new Books("Dune","Franz","HSJNBJD32D",1);
        Books b2 = new Books("Dune2","Franz","HSJNBJDcdD",1);
        Books b3 = new Books("Dune3","Franz","HSJNBJDdc",1);
        Books b4 = new Books("Dune4","Franz","HSJNBJDB45",1);
        Staff s1 = new Staff("Leo","23","leo@gmail.com",1200);
        Staff s2 = new Staff("Leo2","25","leo2@gmail.com",1400);
        Staff s3 = new Staff("Leo3","27","leo3@gmail.com",1600);
        Member m1 = new Member("Ios","12","ios@gmail.com");
        Member m2 = new Member("Ios2","14","ios2@gmail.com");
        Library library = new Library();
        library.addBook(b);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addMember(m1);
        library.addMember(m2);
        library.addStaff(s1);
        library.addStaff(s2);
        library.addStaff(s3);
        m1.borrowBook(b);
        m1.borrowBook(b2);
        m1.returnBook(b);
        m2.borrowBook(b3);
    }
}