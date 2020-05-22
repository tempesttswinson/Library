public class Book extends LibraryItem {

    // properties
    private String genre;// implement enums
    private int numOfPages;
    private Author author;

    // constructor
    public Book(boolean isAvailable, boolean isOverdue, String borrower, String checkOutDate, String returnDate,
            int numOfCopies, String title, String genre, String location, int numOfPages, Author author) {
        super(isAvailable, isOverdue, borrower, checkOutDate, returnDate, numOfCopies, title, location);
        this.genre = genre;
        this.numOfPages = numOfPages;
        this.author = new Author(name);
    }

    // getters and setters
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}