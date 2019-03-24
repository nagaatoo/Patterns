package Struct.Adapter;

public class OldPaySystem implements IOldPaySystem {
    public void doPayment(Account one, Account tho) {
        System.out.println("Do payment");
    }
}
