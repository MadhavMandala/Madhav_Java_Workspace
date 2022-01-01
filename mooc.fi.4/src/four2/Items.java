package four2;

import java.time.Instant;
import java.util.Scanner;
import java.util.ArrayList;

public class Items {

    private String itemName;
    private Instant timeOfCreation = Instant.now();

    public Items(String itemName) {

        this.itemName = itemName;

    }

    public String toString() {

        return "Name: " + itemName + " (created at: " + timeOfCreation + ")";

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Items> itemList = new ArrayList<>();

        while (true) {

           String input = sc.nextLine();

           if (input.isEmpty()) {
               break;
           }

            Items item = new Items(input);

            itemList.add(item);

        }

        for(int i = 0; i < itemList.size(); i++) {

            System.out.println(itemList.get(i));

        }


    }


}
