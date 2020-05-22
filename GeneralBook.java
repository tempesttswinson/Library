public class GeneralBook extends Book {

    public GeneralBook(boolean isAvailable, boolean isOverdue, String borrower, String checkOutDate, String returnDate,
            int numOfCopies, String title, String genre, String location, int numOfPages, Author author) {
        super(isAvailable, isOverdue, borrower, checkOutDate, returnDate, numOfCopies, title, genre, location,
                numOfPages, author);
    }

}