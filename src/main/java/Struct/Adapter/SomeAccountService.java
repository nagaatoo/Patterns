package Struct.Adapter;

public class SomeAccountService {
    public static Account getAccountFromMobilePhone(String mobile) {
        return new Account() {
            public String getMobilePhone() {
                return "999-999-99-00";
            }
        };
    }
}
