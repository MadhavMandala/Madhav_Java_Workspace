package four1.OOPs16;

public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {

        this.balance = openingBalance;

    }

    public void eatAffordably() {

        if (balance >= 2.6) {

            balance -= 2.6;

        }



    }

    public void eatHeartily() {

        if (balance >= 4.6) {

            balance -= 4.6;

        }

    }

    public void addMoney(double amount) {

        if(amount >= 0) {

            balance += amount;


        }

        if (balance >= 150.0) {

            balance = 150;

        }

    }

    public String toString() {

        return balance + " Euros";

    }

}
