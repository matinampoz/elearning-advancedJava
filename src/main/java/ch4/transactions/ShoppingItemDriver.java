package ch4.transactions;

public class ShoppingItemDriver {
    public static void main(String[] args) {
         ShoppingItem book1 = new Book("Java Advanced", "A. Androutsos", "2019");
         ShoppingItem cd1 = new CD("1", "Unforgiven", "Metallica");

         Transactions.saveTransactionItem(book1);
         Transactions.saveTransactionItem(cd1);

        System.out.println("Book Transactions");
        Transactions.showBookTransactions();

        System.out.println("\nCD Transactions");
        Transactions.showCDTransactions();

         //Transactions.showTransactions();
    }
}
