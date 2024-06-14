package ch4.singletonDesignPattern;

public class TransactionsSingleton {
    //με αυτον τον τρόπο εχω ενα μονο instance της κλασης TransactionsSingleton
    public static final TransactionsSingleton TRANSACTIONS_SINGLETON_INSTANCE = new TransactionsSingleton();
    private TransactionsSingleton(){}


}
