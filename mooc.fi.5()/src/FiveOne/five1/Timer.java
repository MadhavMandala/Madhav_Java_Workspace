package FiveOne.five1;

public class Timer {

    private int seconds;
    private int hundrethSeconds;

    public Timer() {

        seconds = 0;
        hundrethSeconds = 0;

    }

    public void advance() {

        hundrethSeconds++;

        if(hundrethSeconds >= 100) {

            seconds++;
            hundrethSeconds = 0;

        }

    }

    public String toString() {

        return seconds + ":" + hundrethSeconds;

    }

}
