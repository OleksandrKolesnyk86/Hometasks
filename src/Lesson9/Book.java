package Lesson9;

public class Book {
    private double prise;
    private String title;
    private String coverType;
    private int quantityOfPages;

    Book(double prise, String title, String coverType, int quantityOfPages) {
        this.prise = prise;
        this.title = title;
        this.coverType = coverType;
        this.quantityOfPages = quantityOfPages;
        setPrise(prise);
        setTitle(title);
        setCoverType(coverType);
        setQuantityOfPages(quantityOfPages);

    }

    void setPrise(double prise) {
        this.prise = prise;
    }

    public double getPrise() {
        return prise;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getCoverType() {
        return coverType;
    }

    void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }
}

