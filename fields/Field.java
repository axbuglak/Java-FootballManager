package fields;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import lib.*;

public interface Field {
  String name = "";
  HashMap<Integer, Integer> playersInGame = new HashMap<Integer, Integer>(); // playerint || position
  HashSet<Integer> playersOnBanch = new HashSet<Integer>();
  HashMap<Integer, Integer[]> positions = new HashMap<Integer, Integer[]>();

  ArrayList<PositionCircle> getPositions();

  Boolean removePlayerFromGame(Player player);

  void setPlayerInGame(Player player, int position);

  void addPlayer(Player player);

  String getName();

  void addPosition(int positionNumber, int x, int y, String team, String role);
  String getResults();

}