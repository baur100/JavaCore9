package zhm14;

public class Library {
    private int number;
    private String book;

    public Library(int number, String book) {
        this.number = number;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Library{" +
                "number=" + number +
                ", book='" + book + '\'' +
                '}';
    }
}
