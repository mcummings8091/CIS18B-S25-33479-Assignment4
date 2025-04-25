import java.util.*;

public class LibraryCollection {
    private HashMap<String, ArrayList<Book>> genreMap;

    public LibraryCollection() {
        genreMap = new HashMap<String, ArrayList<Book>>();  
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
        // TODO: Add books to genreMap
        // boolean genreFound = false;
        if (genreMap.containsKey(book.getGenre())) { //Search through collection for existing genre
            genreMap.get(book.getGenre()).add(book); //If the genre is found, add the book to it's genre category
        } else {
            genreMap.put(book.getGenre(), new ArrayList<>(List.of(book)));//Create a new category and place the book in it.
        }

        /*
        for (String genre : genreMap.keySet()) { //Search through collection for existing genre
            if (book.getGenre().equals(genre)) { //If the genre is found
                genreMap.get(genre).add(book); //Add book to it's genre category 
                genreFound = true;
            }
        }

        if (!genreFound) { //If the books genre wasn't found in the collection
            genreMap.put(book.getGenre(), new ArrayList<>(List.of(book)));//Create a new category and place the book in it. 
        }
        */
    }

    public Iterator<Book> getGenreIterator(String genre) {
        // TODO: Return custom iterator for available books in that genre
        return null;
    }

    // TODO: Add methods to search and return books
}