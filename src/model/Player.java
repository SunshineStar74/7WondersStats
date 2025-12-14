package src.model;
// 7 Wonders Stats
// Player.java
// Aldo Saenz
// Created: Dedember 13, 2025
// Updated: Dedember 14, 2025
// Description: Class representing a player in the 7 Wonders board game for a statistics application.
//              Includes player attributes, constructors, and methods to manage player statistics.
// --------------------------------------------------------------------------------------------------------------------------------------------------



// Imports
import java.util.*;

public class Player {
    // Attributes
    private String name;
    private ArrayList <String> nicknames;

    // Statistics
    private int numGames;
    private int wins;
    private int totalPoints;
    private double averageScore;
    private int highestScore;

    // Game-specific scores
    private int war;
    private int coins;
    private int wonder;
    private int civilian;
    private int commercial;
    private int guilds;
    private int scientific;

    // Total score for the current game
    private int gameTotal;
    // --------------------------------------------------------------------------------------------------------------------------------------------

    // Constructors
    // Default constructor
    public Player() {
        name = "";
        nicknames = new ArrayList<>();

        numGames = 0;
        wins = 0;
        totalPoints = 0;
        averageScore = 0;
        highestScore = 0;

        war = 0;
        coins = 0;
        wonder = 0;
        civilian = 0;
        commercial = 0;
        guilds = 0;
        scientific = 0;
        
        gameTotal = 0;
    }

    // Constructor with name only
    public Player(String n) {
        name = n;
        nicknames = new ArrayList<>();

        numGames = 0;
        wins = 0;
        totalPoints = 0;
        averageScore = 0;
        highestScore = 0;

        war = 0;
        coins = 0;
        wonder = 0;
        civilian = 0;
        commercial = 0;
        guilds = 0;
        scientific = 0;

        gameTotal = 0;
    }

    // Constructor with all score categories
    public Player(String n, int w, int c, int won, int civ, int com, int g, int s) {
        name = n;
        nicknames = new ArrayList<>();

        numGames = 0;
        wins = 0;
        totalPoints = 0;
        averageScore = 0;
        highestScore = 0;

        war = w;
        coins = c;
        wonder = won;
        civilian = civ;
        commercial = com;
        guilds = g;
        scientific = s;

        gameTotal = war + coins + wonder + civilian + commercial + guilds + scientific;
        System.out.println("Previous High Score: " + highestScore);
        highestScore = gameTotal;  // Initially, first score is highest
        System.out.println("New High Score: " + highestScore);
    }

    // Constructor with nicknames and all score categories
    public Player(String n, ArrayList<String> nNames, int w, int c, int won, int civ, int com, int g, int s) {
        name = n;
        nicknames = nNames;

        numGames = 0;
        wins = 0;
        totalPoints = 0;
        averageScore = 0;
        highestScore = 0;
    
        war = w;
        coins = c;
        wonder = won;
        civilian = civ;
        commercial = com;
        guilds = g;
        scientific = s;

        this.gameTotal = war + coins + wonder + civilian + commercial + guilds + scientific;
        System.out.println("Previous High Score: " + this.highestScore);
        this.highestScore = this.gameTotal;  // Initially, first score is highest
        System.out.println("New High Score: " + this.highestScore);
    }
    // --------------------------------------------------------------------------------------------------------------------------------------------

    // Methods

    // Update statistics after playing a game
    public void playedGame(boolean win, int total) {
        numGames++;
        if (win)
            wins++;
        totalPoints += total;
        averageScore =  (double) totalPoints/numGames;
        if (total > highestScore)
            highestScore = total;
    }

    // Getters
    public String getName() { return name; }
    public ArrayList<String> getNicknames() { return nicknames; }
    public int getnumberOfGames() { return numGames; }
    public int getWins() { return wins; }
    public int getTotalPoints (){return totalPoints;}
    public double getAverageScore (){return averageScore;}
    public int getHighestScore (){return highestScore;}
    public int getGameTotal (){return gameTotal;}

    // Setters
    // Add a nickname
    public void addNickname(String nn) { nicknames.add(nn); }
    public void changeName(String newName) { name = newName; }
    public void setGameScores(int w, int c, int won, int civ, int com, int g, int s) {
        war = w;
        coins = c;
        wonder = won;
        civilian = civ;
        commercial = com;
        guilds = g;
        scientific = s;

        gameTotal = war + coins + wonder + civilian + commercial + guilds + scientific;
    }


    // Print player name
    @Override
    public String toString (){return name;}
}
