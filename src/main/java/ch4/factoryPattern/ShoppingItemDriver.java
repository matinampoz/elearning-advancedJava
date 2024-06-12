package ch4.factoryPattern;

public class ShoppingItemDriver {
    public static void main(String[] args) {

        try {
            BookAdvanced book0 = Transactions.createShoppingItem(BookAdvanced.class);
            book0.author("A. Androutsos").title("Java Advanced").year("2019");

            CDAdvanced cd0 = Transactions.createShoppingItem(CDAdvanced.class);
            cd0.id("1").title("Shine on you crazy diamond").producer("Pink Floyd");

            Transactions.saveTransactionItem(book0);
            Transactions.saveTransactionItem(cd0);
            Transactions.showTransactions();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}

