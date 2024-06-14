package ch4.singletonDesignPattern;

public class TransactionsSingleton2 {
    //με αυτον τον τρόπο εχω ενα μονο instance της κλασης TransactionsSingleton
    private static final TransactionsSingleton2 TRANSACTIONS_SINGLETON_INSTANCE = new TransactionsSingleton2();
    private TransactionsSingleton2(){}

    public static TransactionsSingleton2 getInstance() {
        return TRANSACTIONS_SINGLETON_INSTANCE;
    }

}
