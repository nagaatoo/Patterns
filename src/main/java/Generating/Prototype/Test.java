package Generating.Prototype;

public class Test {
    public static void main(String[] args) {
        Account savingAccount = CacheAccount.getSaveAccount();
        Account currentAccount = CacheAccount.getCurrentAccount();
        System.out.println(savingAccount.accountType());
        System.out.println(currentAccount.accountType());
    }
}
