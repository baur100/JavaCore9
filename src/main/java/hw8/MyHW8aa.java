package hw8;

public class MyHW8aa {
    public static void main(String[] args) {
        Book detective = new Book();
        detective.name = "Sherlock Holmes";
        detective.author = "Konan Doyle";
        detective.genre = "Detective";
        detective.sector = 51;
        detective.shelf = 7;

        Book fantastics = new Book();
        fantastics.name = "Around the world in 80 days";
        fantastics.author = "Jules Verne";
        fantastics.genre = "Fantastics";
        fantastics.sector = 87;
        fantastics.shelf = 3;

        printBook(detective);
        printBook(fantastics);


    }

    public static void printBook(Book book) {
        System.out.println("Name of the book = "+ book.name+
                "\nAuthor = " + book.author +
                "\nGenre = " + book.genre+
                "\nBook in sector = " + " "+ book.sector +
                "\nOn the shelf number = "+ " " + book.shelf);
    }
}
