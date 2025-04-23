public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        isAvailable = true;
    }

    public void Checkout() throws BookNotAvailableException {
        if (!isAvailable) {
            throw new BookNotAvailableException("Book is not Available!");
        }
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

     public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "";
        //Todo: print bookdetails
    }
}