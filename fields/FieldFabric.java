package fields;

import java.util.HashMap;
import java.util.HashSet;

public class FieldFabric implements Field {
  private String name;
  private HashMap<Integer, Integer> playersInGame = new HashMap<Integer, Integer>(); // playerint || position
  private HashSet<Integer> playersOnBanch  = new HashSet<Integer>();
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
  
  public void addPlayer(int playerNumber) {
    if(this.playersOnBanch.size() >= 11) return;
    this.playersOnBanch.add(playerNumber);
  }

  public void setPlayerInGame(int playerNumber, int position) {
    if(this.playersOnBanch.size() < 11) return;
    boolean exists = this.playersOnBanch.contains(playerNumber) || this.playersInGame.containsKey(playerNumber);
    if(!exists) return;
    this.playersInGame.remove(playerNumber);
    this.playersInGame.forEach((player, playerPosition) -> {
      if(playerPosition == position) this.playersInGame.remove(player);
    });
    playersInGame.put(playerNumber, position);
  }

  public Boolean removePlayerFromGame(int playerNumber) {
    Integer existsAndRemoved = this.playersInGame.remove(playerNumber); 
    if(existsAndRemoved == null) return false;
    return this.playersOnBanch.add(playerNumber);
  }

  public HashMap<Integer, Integer[]> getPositionsFirst() {
    return positionsFirst;
  }
  public HashMap<Integer, Integer[]> getPositionsSecond() {
    return positionsSecond;
  }

}
