package fields;

import java.util.HashMap;
import java.util.HashSet;

public interface Field {
  String name = "";
  HashMap<Integer, Integer> playersInGame = new HashMap<Integer, Integer>(); // playerint || position
  HashSet<Integer> playersOnBanch = new HashSet<Integer>();
  HashMap<Integer, Integer[]> positions = new HashMap<Integer, Integer[]>();

  HashMap<Integer, Integer[]> getPositionsFirst();
  HashMap<Integer, Integer[]> getPositionsSecond();

  Boolean removePlayerFromGame(int playerNumber);

  void setPlayerInGame(int playerNumber, int position);

  void addPlayer(int playerNumber);

  String getName();

  void addPositionFirstTeam(int positionNumber, int x, int y);
  void addPositionSecondTeam(int positionNumber, int x, int y);

}
