package model;
// 7 Wonders Stats
// Game.java
// Aldo Saenz
// Created: Dedember 13, 2025
// Updated: Dedember 21, 2025
// Description: Class representing a game from the 7 Wonders board game for a statistics application.
//              Includes game attributes, constructors, and methods to manage games.
// --------------------------------------------------------------------------------------------------------------------------------------------------

// Imports
import java.util.HashMap;
import java.util.Map;

public class Game {
    // Attributes
    private int games = 0;
    private final int gameNumber;
    private final HashMap<String, Player> players;

    // -----------------------------------------------------------------------------------------------------------------------------------------------

    // Constructors
    public Game(int num, int numPlayers) {
        gameNumber = num;
        games++;
        players = new HashMap<>();
        System.out.println("Game #" + num + " created with " + numPlayers + " players.");
    }

    // -----------------------------------------------------------------------------------------------------------------------------------------------

    // Methods
    // Setters
    public void addPlayer(Player p) { players.put(p.getName(), p);}
    public void setGameCount(int count) { games = count; }

    // Getters
    public Map<String, Player> getPlayers() { return players; }
    public int getGameNumber() { return gameNumber; }
    public int getGameCount() { return games; }

    // Print game details
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Game #" + gameNumber + ":\n");
        for (Player p : players.values()) {
            sb.append(p.toString()).append(" - ").append(p.getGameTotal()).append(" points\n");
        }
        return sb.toString();
    }
}
