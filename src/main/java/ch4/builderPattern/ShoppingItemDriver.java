package ch4.builderPattern;

public class ShoppingItemDriver {
    public static void main(String[] args) {

        /*
        To book ειναι immutable
         */
        ShoppingItem book = new Book.Builder()
                .bookAuthor("A. Androutsos")
                .bookTitle("Advanced Java")
                .pubYear("2019")
                .build();

        Transactions.saveTransactionItem(book);
        Transactions.showTransactions();
    }

}
