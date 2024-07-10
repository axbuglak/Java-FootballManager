package fields;

import java.util.HashMap;
import java.util.HashSet;

import lib.Player;

public class FieldFabric implements Field {
  private String name;
  private HashMap<Player, Integer> playersInGame = new HashMap<Player, Integer>(); // playerint || position
  private HashSet<Player> playersOnBanch  = new HashSet<Player>();
  private HashMap<Integer, Integer[]> positionsFirst = new HashMap<Integer, Integer[]>();
  private HashMap<Integer, Integer[]> positionsSecond = new HashMap<Integer, Integer[]>();

  public FieldFabric(String name) {
   this.name = name;
  }

  public void addPositionFirstTeam(int positionNumber, int x, int y) {
    Integer[] graphPosition = { x, y };
    positionsFirst.put(positionNumber, graphPosition);
  }

  public void addPositionSecondTeam(int positionNumber, int x, int y) {
    Integer[] graphPosition = { x, y };
    positionsSecond.put(positionNumber, graphPosition);
  }

  public String getName() {
    return name;
  }
  
  public void addPlayer(Player player) {
    if(this.playersOnBanch.size() >= 11) return;
    this.playersOnBanch.add(player);
  }

  public void setPlayerInGame(Player player, int position) {
    if(this.playersOnBanch.size() < 11) return;
    boolean exists = this.playersOnBanch.contains(player) || this.playersInGame.containsKey(player);
    if(!exists) return;
    this.playersInGame.remove(player);
    // this.playersInGame.forEach((player, playerPosition) -> {
    //   if(playerPosition == position) this.playersInGame.remove(player);
    // });
    playersInGame.put(player, position);
  }

  public Boolean removePlayerFromGame(Player player) {
    Integer existsAndRemoved = this.playersInGame.remove(player); 
    if(existsAndRemoved == null) return false;
    return this.playersOnBanch.add(player);
  }

  public HashMap<Integer, Integer[]> getPositionsFirst() {
    return positionsFirst;
  }
  public HashMap<Integer, Integer[]> getPositionsSecond() {
    return positionsSecond;
  }

  public String getResults() {
    return "Commands are not full enough";
  }
}
