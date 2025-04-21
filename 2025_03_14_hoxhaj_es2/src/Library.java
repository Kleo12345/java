public class Library {
    String title;
    int year;

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Library(String title, int year) {
        this.title = title;
        this.year = year;
    }
}
