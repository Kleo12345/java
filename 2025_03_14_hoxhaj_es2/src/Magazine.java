public class Magazine extends Library{
    int publicationNumber;

    @Override
    public String toString() {
        return "Magazine{" +
                "publicationNumber=" + publicationNumber +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public int getPublicationNumber() {
        return publicationNumber;
    }

    public void setPublicationNumber(int publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    public Magazine(String title, int year, int publicationNumber) {
        super(title, year);
        this.publicationNumber = publicationNumber;
    }
}
