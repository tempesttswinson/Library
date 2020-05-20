public class CardHolder {

    private String name, dateJoined;
    private boolean canCheckOut, canReserve;

    public CardHolder(String name, String dateJoined, boolean canCheckOut, boolean canReserve) {
        this.name = name;
        this.dateJoined = dateJoined;
        this.canCheckOut = canCheckOut;
        this.canReserve = canReserve;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public boolean isCanCheckOut() {
        return canCheckOut;
    }

    public void setCanCheckOut(boolean canCheckOut) {
        this.canCheckOut = canCheckOut;
    }

    public boolean isCanReserve() {
        return canReserve;
    }

    public void setCanReserve(boolean canReserve) {
        this.canReserve = canReserve;
    }

}