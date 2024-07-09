package fields;

import java.util.HashMap;
import java.util.HashSet;

public interface Field {
  String name = "";
  HashMap<Integer, Integer> playersInGame = new HashMap<Integer, Integer>(); // playerint || position
  HashSet<Integer> playersOnBanch = new HashSet<Integer>();
  HashMap<Integer, Integer[]> positions = new HashMap<Integer, Integer[]>();

  HashMap<Integer, Integer[]> getPositions();

  Boolean removePlayerFromGame(int playerNumber);

  void setPlayerInGame(int playerNumber, int position);

  void addPlayer(int playerNumber);

  String getName();

  void addPosition(int positionNumber, int x, int y);

}
