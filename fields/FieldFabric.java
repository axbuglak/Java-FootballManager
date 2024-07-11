package fields;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import lib.PositionCircle;

import lib.Player;

public class FieldFabric implements Field {
  private String name;
  private HashMap<Player, Integer> playersInGame = new HashMap<Player, Integer>(); // playerint || position
  private HashSet<Player> playersOnBanch = new HashSet<Player>();
  private ArrayList<PositionCircle> positions = new ArrayList<PositionCircle>();
  private double teamOneScore = 0, teamTwoScore = 0;

  public FieldFabric(String name) {
    this.name = name;
  }

  public void addPosition(int positionNumber, int x, int y, String team, String role) {
    positions.add(new PositionCircle(positionNumber, x, y, 20, team, role));
  }

  public String getName() {
    return name;
  }

  public void addPlayer(Player player) {
    if (this.playersOnBanch.size() >= 11)
      return;
    this.playersOnBanch.add(player);
  }

  public void setPlayerInGame(Player player, int position) {
    // boolean exists = this.playersOnBanch.contains(player) ||
    //     this.playersInGame.containsKey(player);
    // if (!exists) {
    //   return;
    // }
    this.playersInGame.remove(player);
    if (player.getTeam().equals("first")) {
      this.teamOneScore += player.getStats();
    } else {
      this.teamTwoScore += player.getStats();
    }
    this.playersInGame.put(player, position);
  }

  public Boolean removePlayerFromGame(Player player) {
    Integer existsAndRemoved = this.playersInGame.remove(player);
    if (existsAndRemoved == null) {
      return false;
    }
    return this.playersOnBanch.add(player);
  }

  public ArrayList<PositionCircle> getPositions() {
    return positions;
  }

  public String getResults() {
    System.out.println(playersInGame.size());
    if (playersInGame.size() < 22) {
      return "Commands are not full enough";
    }
    if (teamOneScore == teamTwoScore) {
      return "Draw!";
    }
    return teamOneScore > teamTwoScore ? "Team one won" : "Team two won";
  }
}