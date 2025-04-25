import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryCollection library = new LibraryCollection();

        // TODO: Add sample books to library
        Book book1 = new Book("The Chronicles of Narnia: The Lion, The Witch, and The Wardrobe", "C.S. Lewis", "Fantasy");

        Book book2 = new Book("Metro 2023", "Dimitry Glukhovsky","Science Fiction");
        Book book3 = new Book("Metro 2035", "Dimitry Glukhovsky","Science Fiction");


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayContents();

        // TODO: Prompt user for genre, list available books using iterator

        // TODO: Allow checkout and return, handling exceptions

        scanner.close();
    }
}