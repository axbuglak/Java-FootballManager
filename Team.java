import java.util.ArrayList;

import players.MessiPlayer;
import players.Player;

public class Team {
  private ArrayList<Player> players = new ArrayList<Player>();

  public Team() {
    addPlayer(new MessiPlayer());
  }

  private void addPlayer(Player player) {
    this.players.add(player);
  }

  public ArrayList<Player> getTeam() {
    return players;
  }
}
