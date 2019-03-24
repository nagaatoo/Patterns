package Struct.Bridge;

public class SomeBank extends Bank {
    public SomeBank(Account account) {
        super(account);
    }

    public Account openAccount() {
        System.out.println("Open acc in some bank");
        return account;
    }
}
