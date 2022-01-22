package four3.Files11;

import java.util.Scanner;

public class Files11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = sc.nextLine();
        String path = "C:\\Users\\Madhav\\Madhav_Java_Workspace\\mooc.fi.4\\src\\four3\\Files11\\" + fileName;

        System.out.println("Team:");
        String teamName = sc.nextLine();

        Team team = new Team(teamName, path);

        team.printData();

    }

}
