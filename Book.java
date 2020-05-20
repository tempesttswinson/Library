public class Book extends LibraryItem {

    private String genre;
    private int numOfPages;

    public Book(boolean isAvailable, boolean isOverdue, String borrower, String checkOutDate, String returnDate,
            int numOfCopies, String title, String genre, String location, int numOfPages) {
        super(isAvailable, isOverdue, borrower, checkOutDate, returnDate, numOfCopies, title, location);
        this.genre = genre;
        this.numOfPages = numOfPages;
    }

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

}