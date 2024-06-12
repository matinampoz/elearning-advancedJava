package ch4.factoryPattern;
/*
Το abstract factory design pattern εχει ως στόχο να αποκρύψει τελειως τισ κλασεις BookAdv και CDAdv απο την main.
H main δηλαδή θέλουμε να βλεπει μόνο την transactions(οσον αφορα τους constructors) και να αποκρυωουμε την δυνατότητα
να καλέι constructors και static factory μεθοδους της BookAdv και CDAdv
 */
public class BookAdvanced implements ShoppingItem {
    private String bookTitle;
    private String bookAuthor;
    private String pubYear;


    //εχω package private προσβαση. ετσι αν η main ειναι εκτός πακέτου δεν θα μπορει να καλεσει την getInstance
    static BookAdvanced getInstance() {
        return new BookAdvanced();
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
