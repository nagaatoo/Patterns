package Struct.Bridge;

public class Test {
    public static void main(String[] args) {
        SomeBank bank = new SomeBank(new SaveAccount());
        bank.openAccount().openAccount();
    }
}
