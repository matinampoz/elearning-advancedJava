package ch4.singletonDesignPattern;

public class TransactionsDriver {
    public static void main(String[] args) {
        TransactionsSingleton transactionsSingleton = TransactionsSingleton.TRANSACTIONS_SINGLETON_INSTANCE;
        System.out.println(transactionsSingleton);

        TransactionsSingleton transactionsSingleton2 = TransactionsSingleton.TRANSACTIONS_SINGLETON_INSTANCE;
        System.out.println(transactionsSingleton2);

        TransactionsSingleton2 transactionsSingleton21 = TransactionsSingleton2.getInstance();
        System.out.println(transactionsSingleton21);

        TransactionsSingleton2 transactionsSingleton22 = TransactionsSingleton2.getInstance();
        System.out.println(transactionsSingleton22);

        TransactionsSingleton3 transactionsSingleton31 = TransactionsSingleton3.TRANSACTIONS_SINGLETON_3_INSTANCE;
        System.out.println(transactionsSingleton31.hashCode());

        TransactionsSingleton3 transactionsSingleton32 = TransactionsSingleton3.TRANSACTIONS_SINGLETON_3_INSTANCE;
        System.out.println(transactionsSingleton32.hashCode());
    }
}
