package Struct.Bridge;

public abstract class Bank {

    protected final Account account;
    public Bank(Account account) {
        this.account = account;
    }
    abstract public Account openAccount();
}
