public class Book extends LibraryItem {

    private String title, genre, location;
    private int numOfPages;

    public Book(boolean isAvailable, boolean isOverdue, String borrower, String checkOutDate, String returnDate,
            int numOfCopies, String title, String genre, String location, int numOfPages) {
        super(isAvailable, isOverdue, borrower, checkOutDate, returnDate, numOfCopies);
        this.title = title;
        this.genre = genre;
        this.location = location;
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

}