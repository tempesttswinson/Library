public class Author {

    private String name;
    private PublishingCompany company;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublishingCompany getCompany() {
        return company;
    }

    public void setCompany(PublishingCompany company) {
        this.company = company;
    }

}