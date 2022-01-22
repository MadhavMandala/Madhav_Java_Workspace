package four3.Files11;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Team {

    private String name;
    private int[] teamData;


    public Team(String teamName, String path) {

        ArrayList<String[]> gameData = createDataList(path);

        this.teamData = returnGames(gameData, teamName);

    }

    public static ArrayList<String[]> createDataList(String path) {

        ArrayList<String[]> gameData = new ArrayList<>();

        try {

            Scanner fileReader = new Scanner(Paths.get(path));

            while (fileReader.hasNextLine()) {

                String currentLine = fileReader.nextLine();

                String[] currentLineData = currentLine.split(",");

                gameData.add(currentLineData);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return gameData;

    }

    public static int[] returnGames(ArrayList<String[]> gameData, String teamName) {

        int[] teamData = new int[3];

        int numGames = 0;
        int wins = 0;
        int losses = 0;

        for (String[] game : gameData) {

            if(game[0].equals(teamName)) {

                numGames++;

                if(Integer.valueOf(game[2]) > Integer.valueOf(game[3])) {

                    wins++;

                } else {

                    losses++;

                }


            } if (game[1].equals(teamName)) {

                numGames++;

                if(Integer.valueOf(game[3]) > Integer.valueOf(game[2])) {

                    wins++;

                } else {

                    losses++;

                }

            }

        }

        teamData[0] = numGames;
        teamData[1] = wins;
        teamData[2] = losses;

        return teamData;

    }

    public void printData() {

        System.out.println("Games: " + this.teamData[0]);
        System.out.println("Wins: " + this.teamData[1]);
        System.out.println("Losses: " + this.teamData[2]);

    }

}
