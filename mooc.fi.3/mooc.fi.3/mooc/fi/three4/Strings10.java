package mooc.fi.three4;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Strings10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYear = new ArrayList<>();

        while(true) {

            String input = sc.nextLine();

            if(input.equals("")) {

                break;

            }

            String[] split = input.split(",");

            names.add(split[0]);
            birthYear.add(Integer.valueOf(split[1]));

        }

        int largestLength = 0;
        int index = 0;

        for(int i = 0; i < names.size(); i++) {

            if(names.get(i).length() > largestLength) {

                largestLength = names.get(i).length();
                index = i;

            }

        }

        int sum = 0;

        for(int i = 0; i < birthYear.size(); i++) {

            sum += birthYear.get(i);

        }

        System.out.println("Longest name: " + names.get(index));
        System.out.println("Average of the birth years: " + ((double)sum)/birthYear.size());

    }

}
