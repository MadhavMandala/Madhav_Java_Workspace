package four1.OOPs2;

public class Account {

    public String details;
    public int balance;

    public Account(String det, int bal) {

        this.details = det;
        this.balance = bal;

    }

    public void deposit(int money) {

        this.balance += money;

    }

    public void withdraw(int money) {

        this.balance -= money;

    }



}
