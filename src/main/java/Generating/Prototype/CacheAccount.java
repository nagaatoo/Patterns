package Generating.Prototype;

import java.util.HashMap;
import java.util.Map;

public class CacheAccount {
    private final static Map<AccountType, Account> cashMap = new HashMap<AccountType, Account>();
    static {
        Account saveAccount = new SavingAccount();
        Account currentAccount = new CurrentAccount();
        cashMap.put(AccountType.SAVING_ACCOUNT, saveAccount);
        cashMap.put(AccountType.CURRENT_ACCOUNT, currentAccount);
    }

    public static Account getSaveAccount() {
        return (Account) cashMap.get(AccountType.SAVING_ACCOUNT).clone();
    }

    public static Account getCurrentAccount() {
        return (Account) cashMap.get(AccountType.CURRENT_ACCOUNT).clone();
    }
}
