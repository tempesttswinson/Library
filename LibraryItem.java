
public class LibraryItem implements Reservable, Loanable {

    // properties
    private boolean isAvailable, isOverdue;
    private String borrower;// find a way to intergrate Card Holder class
    private String checkOutDate, returnDate, title, location;
    private int numOfCopies;

    // default constuctor
    public LibraryItem(boolean isAvailable, boolean isOverdue, String borrower, String checkOutDate, String returnDate,
            int numOfCopies, String location, String title) {
        this.isAvailable = isAvailable;
        this.isOverdue = isOverdue;
        this.borrower = borrower;
        this.checkOutDate = checkOutDate;
        this.returnDate = returnDate;
        this.title = title;
        this.location = location;
        this.numOfCopies = numOfCopies;
    }

    // constuctor for when the item has not been borrowed by anyone
    public LibraryItem(boolean isAvailable, int numOfCopies) {
        this.isAvailable = isAvailable;
        this.numOfCopies = numOfCopies;
    }

    // getters & setters
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isOverdue() {
        return isOverdue;
    }

    public void setOverdue(boolean isOverdue) {
        this.isOverdue = isOverdue;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LibraryItem [isAvailable=" + isAvailable + ", numOfCopies=" + numOfCopies + "]";
    }

    @Override
    public boolean canReserve() {
        return false;
    }

    @Override
    public boolean canLoan() {
        return false;
    }

    @Override
    public int getLoanTerm() {
        return 0;
    }

}