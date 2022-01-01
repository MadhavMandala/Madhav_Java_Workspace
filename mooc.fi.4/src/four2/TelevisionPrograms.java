package four2;

import java.util.Scanner;
import java.util.ArrayList;

public class TelevisionPrograms {

    private String name;
    private int duration;

    public TelevisionPrograms(String name, int duration) {

        this.name = name;
        this.duration = duration;

    }

    public int getDuration() {

        return this.duration;

    }

    public String toString() {

        return name + ", " + duration + " minutes";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<TelevisionPrograms> telePrograms = new ArrayList<>();

        while (true) {

            System.out.println("Name: ");
            String name = sc.nextLine();

            if(name.isEmpty()) {
                break;
            }

            System.out.println("Duration: ");
            int duration = sc.nextInt();
            sc.nextLine();

            TelevisionPrograms program = new TelevisionPrograms(name, duration);

            telePrograms.add(program);

        }

        System.out.println("Max duration: ");
        int maxDuration = sc.nextInt();

        for(TelevisionPrograms tele: telePrograms) {

            if (tele.duration <= maxDuration) {

                System.out.println(tele);

            }

        }

    }


}
