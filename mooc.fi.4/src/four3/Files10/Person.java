package four3.Files10;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String[] tempArray) {
    }

    public void Person(String[] details) {

        this.name = details[0];
        this.age = Integer.valueOf(details[1]);

    }

    public static ArrayList<Person> readRecordsFromFile(String path) {

        ArrayList<Person> tempArr = new ArrayList();

        try {

            Scanner fileReader = new Scanner(Paths.get(path));

            while(fileReader.hasNextLine()) {

                String currentLine = fileReader.nextLine();

                String[] tempArray= currentLine.split(",");

                Person currentPerson = new Person(tempArray);

                tempArr.add(currentPerson);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return tempArr;

    }



}
