package four1.OOPs8;

public class OOPs8 {

    public static void main(String[] args) {

        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();

    }

}
