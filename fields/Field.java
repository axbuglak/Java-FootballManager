package fields;

import java.util.HashMap;
import java.util.HashSet;

import lib.Player;

public interface Field {
  String name = "";
  HashMap<Integer, Integer> playersInGame = new HashMap<Integer, Integer>(); // playerint || position
  HashSet<Integer> playersOnBanch = new HashSet<Integer>();
  HashMap<Integer, Integer[]> positions = new HashMap<Integer, Integer[]>();

  HashMap<Integer, Integer[]> getPositionsFirst();
  HashMap<Integer, Integer[]> getPositionsSecond();

  Boolean removePlayerFromGame(Player player);

  void setPlayerInGame(Player player, int position);

  void addPlayer(Player player);

  String getName();

  void addPositionFirstTeam(int positionNumber, int x, int y);
  void addPositionSecondTeam(int positionNumber, int x, int y);
  String getResults();

}
