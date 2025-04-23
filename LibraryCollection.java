import java.util.*;

public class LibraryCollection {
    private Map<String, List<Book>> genreMap;

    public LibraryCollection() {
        genreMap = new HashMap<>();
    }

    public void addBook(Book book) {
        // TODO: Add books to genreMap
    }

    public Iterator<Book> getGenreIterator(String genre) {
        // TODO: Return custom iterator for available books in that genre
        return null;
    }

    // TODO: Add methods to search and return books
}