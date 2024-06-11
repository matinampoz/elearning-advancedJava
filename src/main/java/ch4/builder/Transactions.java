package ch4.builder;


public class Transactions {

    private static ShoppingItem[] transactions = new ShoppingItem[100];
    private static int pivot = 0;

    public static void saveTransactionItem(ShoppingItem shoppingItem){
        transactions[pivot++] = shoppingItem;
    }

    public static void showTransactions(){
        for (ShoppingItem shoppingItem : transactions){
            if (shoppingItem != null)
                System.out.println(shoppingItem);
        }
    }

    public static void showBookTransactions(){
        for (ShoppingItem shoppingItem : transactions){
            if (shoppingItem instanceof BookAdvanced)
                System.out.println(shoppingItem);
        }
    }

    public static void showCDTransactions(){
        for (ShoppingItem shoppingItem : transactions){
            if (shoppingItem instanceof CDAdvanced)
                System.out.println(shoppingItem);
        }
    }
}
