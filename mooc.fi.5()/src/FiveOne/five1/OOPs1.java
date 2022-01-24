package FiveOne.five1;

import java.util.Date;

public class OOPs1 {

    public static void main(String[] args) {

        Timer timer = new Timer();
              //timer value = 8:48:10:300
        while (true) {
            System.out.println(timer);
            Date startDate = new Date();
            timer.advance();
            Date endDate = new Date();

            double diff = endDate.getTime() - startDate.getTime();
            System.out.println("Time taken to execute advance : "+diff);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }

    }

}
