package mooc.fi.three4;

import java.util.Scanner;

public class Strings3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Username: ");
        String username = sc.nextLine();

        System.out.println("Password: ");
        String password = sc.nextLine();

        if(username.equals("alex")) {

            if(password.equals("sunshine")) {

                System.out.println("You have successfully logged in!");

            } else {

                System.out.println("Incorrect username or password.");

            }

        } else if (username.equals("emma")) {

            if(password.equals("haskell")) {

                System.out.println("You have successfully logged in!");

            } else {

                System.out.println("Incorrect username or password.");

            }

        } else {

            System.out.println("Incorrect username or password.");

        }

    }

}
