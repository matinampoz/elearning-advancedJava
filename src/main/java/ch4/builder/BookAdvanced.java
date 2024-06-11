package ch4.builder;

public class BookAdvanced implements ShoppingItem {
    private String bookTitle;
    private String bookAuthor;
    private String pubYear;

    /*
    οι factory μεθοδοι ειναι creative δηλαδη επιστρφουν instances
    οι static factory ανηκουν στην κλαση
     */

    //static factory method
    public static BookAdvanced getInstance() {
        return new BookAdvanced();
        /*
        προτιμω αυτην την υλοποιηση σε σχεση με αυτην public BookAdvanced() {}
        γιατι μπορω να χρησιμοποιησω αλλο ονομα και οχι της κλασης και επισης μπορω να προσθεσω
        και άλλες εντολες πχ καποιους ελεγχους με if
         */
    }

    //Builder Design Pattern
    public BookAdvanced title(String bookTitle){
        //ειναι setter που αρχικοποιει το πεδιο και επιστρεφει το αντικειμενο
        this.bookTitle = bookTitle;
        return this;
    }

    public BookAdvanced author(String bookAuthor){
        this.bookAuthor = bookAuthor;
        return this;
    }

    public BookAdvanced year(String pubYear){
        this.pubYear = pubYear;
        return this;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getPubYear() {
        return pubYear;
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
