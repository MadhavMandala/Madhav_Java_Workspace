package four2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonalInformation {

    private String firstName;
    private String lastName;
    private int idNumber;

    public PersonalInformation(String firstName, String lastName, int idNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;

    }

    public String toString() {

        return this.firstName + " " + this.lastName;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<PersonalInformation> perInfoList = new ArrayList<>();

        String inputFirstName;
        String inputLastName;
        int inputIDNumber;

        while(true) {

            System.out.println("First name: ");
            inputFirstName = sc.nextLine();

            if(inputFirstName.equals("")) {
                break;
            }

            System.out.println("Last name: ");
            inputLastName = sc.nextLine();

            System.out.println("Identification Number: ");
            inputIDNumber = sc.nextInt();
            sc.nextLine();

            PersonalInformation person = new PersonalInformation(inputFirstName, inputLastName, inputIDNumber);

            perInfoList.add(person);

        }

        for(int i = 0; i < perInfoList.size(); i++) {

            System.out.println(perInfoList.get(i).toString());

        }


    }

}
