package FiveTwo.Overload2;

public class Counter {

    private int value;

    public Counter() {

        this(0);

    }

    public Counter(int startValue) {

        this.value = startValue;

    }

    public int value() {

        return value;

    }

    public void increase() {

        value++;

    }

    public void increase(int increaseBy) {

        value+=increaseBy;

    }

    public void decrease() {

        value--;

    }

    public void decrease(int decreaseBy) {

        value -= decreaseBy;

    }

}
