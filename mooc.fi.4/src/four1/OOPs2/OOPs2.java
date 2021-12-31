package four1.OOPs2;

public class OOPs2 {

    public static void main(String[] args) {

        Account matthewsAccount = new Account("Matthew's Account", 1000);
        Account myAccount = new Account("My account", 0);

        matthewsAccount.withdraw(100);
        myAccount.deposit(100);

        System.out.println(matthewsAccount.balance);
        System.out.println(myAccount.balance);

    }

}
