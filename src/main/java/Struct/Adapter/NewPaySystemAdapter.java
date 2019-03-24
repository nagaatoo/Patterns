package Struct.Adapter;

public class NewPaySystemAdapter implements INewPaySystem {

    private final IOldPaySystem oldPaySystem;

    public NewPaySystemAdapter(IOldPaySystem system) {
        this.oldPaySystem = system;
    }

    public void doPaymentNew(String mobile1, String mobile2) {
        Account acc1 = SomeAccountService.getAccountFromMobilePhone(mobile1);
        Account acc2 = SomeAccountService.getAccountFromMobilePhone(mobile2);
        oldPaySystem.doPayment(acc1, acc2);
    }
}
