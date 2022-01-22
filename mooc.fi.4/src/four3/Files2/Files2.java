package four3.Files2;

import java.util.Scanner;

public class Files2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            String input = sc.nextLine();

            if(input.equals("end")) {
                break;
            }

            int intInput = Integer.valueOf(input);

            System.out.println(intInput*intInput*intInput);

        }

    }

}
