package ch4.transactions;

public class Book implements ShoppingItem{
    private String bookTitle;
    private String bookAuthor;
    private String pubYear;

    public Book() {}

    public Book(String bookTitle, String bookAuthor, String pubYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.pubYear = pubYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getPubYear() {
        return pubYear;
    }

    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", pubYear='" + pubYear + '\'' +
                '}';
    }
}
