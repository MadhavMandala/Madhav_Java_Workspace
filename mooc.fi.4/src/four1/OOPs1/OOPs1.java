package four1.OOPs1;

public class OOPs1 {

    public static void main(String[] args) {

        Account acc = new Account("Test", 100);

        acc.deposit(20);

        System.out.println(acc.balance);

    }

}
