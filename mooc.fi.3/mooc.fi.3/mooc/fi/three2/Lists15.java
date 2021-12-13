package mooc.fi.three2;

import java.util.ArrayList;

public class Lists15 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));

    }

    public static int sum(ArrayList<Integer> arrList) {

        int sum = 0;

        for (int i = 0; i < arrList.size(); i++) {

            sum+= arrList.get(i);

        }

        return sum;

    }

}
