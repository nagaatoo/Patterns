package Struct.Adapter;

public class Test {
    public static void main(String[] args) {
        IOldPaySystem oldSystem = new OldPaySystem();
        INewPaySystem newSystem = new NewPaySystemAdapter(oldSystem);
        newSystem.doPaymentNew("999-123-23-12", "989-123-21-12");
    }
}
