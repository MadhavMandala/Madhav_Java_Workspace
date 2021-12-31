package four1.OOPs15;

import java.util.ArrayList;

public class Statistics {

    private ArrayList<Integer> list = new ArrayList<>();

    public Statistics() {

        this.list = new ArrayList<>();

    }

    public void addNumber(int num) {

        this.list.add(num);

    }

    public void getCount() {

        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0; i < this.list.size(); i++) {

            sum += list.get(i);

            if(list.get(i) % 2 == 0) {

                sumEven += list.get(i);

            } else {

                sumOdd += list.get(i);

            }


        }

        System.out.println("Sum: " + sum);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

    }



}
