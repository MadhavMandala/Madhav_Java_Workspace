package mooc.fi.three4;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;
import java.util.ArrayList;

public class Strings9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();

            if(input.equals("")) {

                break;

            }

            String[] split = input.split(",");

            names.add(split[0]);
            ages.add(Integer.valueOf(split[1]));

        }
        int index = 0;
        int largest = 0;

        for (int i = 0; i < ages.size(); i++) {

            if(ages.get(i) > largest) {

                largest = ages.get(i);
                index = i;

            }

        }

        System.out.println("Name of the oldest: " + names.get(index));

    }

}
