package ch4.builder;

public class ShoppingItemDriver {
    public static void main(String[] args) {
        ShoppingItem book0 = BookAdvanced.getInstance().title("Java Advanced").author("A. Androytsos").year("2019");

        ShoppingItem cd0 = CDAdvanced.getInstance()
                .id("0")
                .title("Historia De Un Amor")
                .producer("French Latino");

        Transactions.saveTransactionItem(book0);
        Transactions.saveTransactionItem(cd0);
        Transactions.showTransactions();

    }


}

