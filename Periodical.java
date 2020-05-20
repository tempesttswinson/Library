public class Periodical extends LibraryItem {

    private int issueNum;
    private String issueFreq;// implement enums

    public Periodical(boolean isAvailable, boolean isOverdue, String borrower, String checkOutDate, String returnDate,
            int numOfCopies, String location, String title, int issueNum, String issueFreq) {
        super(isAvailable, isOverdue, borrower, checkOutDate, returnDate, numOfCopies, location, title);
        this.issueNum = issueNum;
        this.issueFreq = issueFreq;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public String getIssueFreq() {
        return issueFreq;
    }

    public void setIssueFreq(String issueFreq) {
        this.issueFreq = issueFreq;
    }

}