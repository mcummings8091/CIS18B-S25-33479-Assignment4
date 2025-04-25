import java.util.*;

public class LibraryCollection {
    private HashMap<String, ArrayList<Book>> genreMap;

    public LibraryCollection() {
        genreMap = new HashMap<>();  
    }

    //Testing method
    public void displayContents() {
        for (String genre : genreMap.keySet()) {
            System.out.println(genre + ":");
            for (Book genreListing : genreMap.get(genre)) {
                System.out.println(genreListing.getTitle());
            }
            System.out.println("\n\n");
        }
    }

    public void addBook(Book book) {
        if (genreMap.containsKey(book.getGenre())) { //Search through collection for existing genre
            genreMap.get(book.getGenre()).add(book); //If the genre is found, add the book to it's genre category
        } else {
            genreMap.put(book.getGenre(), new ArrayList<>(List.of(book)));//Create a new category and place the book in it.
        }
    }

    public Iterator<Book> getGenreIterator(String genre) {
        // TODO: Return custom iterator for available books in that genre
        return null;
    }

    // TODO: Add methods to search and return books
}