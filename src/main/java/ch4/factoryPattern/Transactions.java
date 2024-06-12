package ch4.factoryPattern;

/*
εδω θα πρέπει να δημιουργήσουμε καποιες factory μεθοδους που δημιουργουν αντικειμενα Book και CD
 */
public class Transactions {
    public enum ItemType{BOOK, CD}

    private static ShoppingItem[] transactions = new ShoppingItem[100];
    private static int pivot = 0;

    public static ShoppingItem createShoppingItem(ItemType itemType){
        switch (itemType) {
            case BOOK:
                return BookAdvanced.getInstance();
            case CD:
                return CDAdvanced.getInstance();
            default:
                return null;
        }
    }

    public static <T extends ShoppingItem> T createShoppingItem(Class<T> item) throws InstantiationException, IllegalAccessException {
        return item.newInstance();
    }

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
