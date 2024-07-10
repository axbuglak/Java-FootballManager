package lib;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Team {
  private List<Player> players = new ArrayList<Player>();
  private static int playersCount = 0;

  public Team() {
    addPlayer(new Player("Lionel", "Messi", 34, 10, 9.5, 8.0, 1.70, 9.0, getInitialPosition()));
    addPlayer(new Player("Cristiano", "Ronaldo", 36, 7, 9.0, 9.5, 1.87, 8.5, getInitialPosition()));
    addPlayer(new Player("Neymar", "Jr", 29, 11, 9.2, 7.5, 1.75, 9.1, getInitialPosition()));
    addPlayer(new Player("Kylian", "Mbappe", 22, 7, 9.8, 8.0, 1.78, 8.7, getInitialPosition()));
    addPlayer(new Player("Kevin", "De Bruyne", 30, 17, 8.5, 8.0, 1.81, 9.0, getInitialPosition()));
    addPlayer(new Player("Virgil", "van Dijk", 30, 4, 8.0, 9.0, 1.93, 7.8, getInitialPosition()));
    addPlayer(new Player("Mohamed", "Salah", 29, 11, 9.0, 7.5, 1.75, 8.7, getInitialPosition()));
    addPlayer(new Player("Robert", "Lewandowski", 32, 9, 8.5, 9.0, 1.84, 8.5, getInitialPosition()));
    addPlayer(new Player("Sadio", "Mane", 29, 10, 9.0, 7.5, 1.75, 8.3, getInitialPosition()));
    addPlayer(new Player("Sergio", "Ramos", 35, 4, 7.8, 8.5, 1.84, 7.5, getInitialPosition()));
    addPlayer(new Player("Antoine", "Griezmann", 30, 7, 8.7, 7.0, 1.76, 8.2, getInitialPosition()));
    addPlayer(new Player("Eden", "Hazard", 30, 7, 8.8, 7.2, 1.75, 8.4, getInitialPosition()));
    addPlayer(new Player("Luka", "Modric", 36, 10, 8.3, 7.0, 1.74, 8.7, getInitialPosition()));
    addPlayer(new Player("Paul", "Pogba", 28, 6, 8.5, 8.2, 1.91, 8.3, getInitialPosition()));
    addPlayer(new Player("Raheem", "Sterling", 28, 7, 9.2, 7.4, 1.70, 8.5, getInitialPosition()));
    addPlayer(new Player("Harry", "Kane", 28, 10, 8.8, 8.8, 1.88, 8.1, getInitialPosition()));
    addPlayer(new Player("Marcus", "Rashford", 24, 10, 9.0, 7.5, 1.85, 8.4, getInitialPosition()));
    addPlayer(new Player("Gareth", "Bale", 32, 11, 9.1, 8.0, 1.83, 8.0, getInitialPosition()));
    addPlayer(new Player("Toni", "Kroos", 31, 8, 8.2, 7.5, 1.83, 8.8, getInitialPosition()));
    addPlayer(new Player("Thiago", "Silva", 37, 6, 7.5, 8.5, 1.83, 7.9, getInitialPosition()));
    addPlayer(new Player("Philipp", "Lahm", 39, 21, 8.7, 8.0, 1.70, 8.9, getInitialPosition()));
    addPlayer(new Player("Hakan", "Çalhanoğlu", 27, 10, 8.9, 7.4, 1.82, 8.3, getInitialPosition()));
    addPlayer(new Player("Pavel", "Nedvěd", 46, 11, 8.0, 7.8, 1.74, 8.2, getInitialPosition()));
    addPlayer(new Player("Franck", "Ribéry", 38, 7, 8.6, 7.0, 1.70, 8.6, getInitialPosition()));
    addPlayer(new Player("Andrea", "Pirlo", 45, 21, 7.8, 6.5, 1.77, 9.0, getInitialPosition()));
    addPlayer(new Player("Roberto", "Carlos", 48, 3, 9.2, 8.5, 1.68, 8.4, getInitialPosition()));
    addPlayer(new Player("Xavi", "Hernández", 34, 6, 8.3, 7.2, 1.70, 9.1, getInitialPosition()));
    addPlayer(new Player("Andrés", "Iniesta", 37, 8, 8.5, 7.0, 1.70, 8.8, getInitialPosition()));
    addPlayer(new Player("Zinedine", "Zidane", 50, 5, 8.0, 7.5, 1.85, 8.0, getInitialPosition()));
    addPlayer(new Player("David", "Beckham", 47, 23, 8.7, 7.8, 1.83, 8.2, getInitialPosition()));
    addPlayer(new Player("Javier", "Zanetti", 51, 4, 8.2, 7.0, 1.78, 8.7, getInitialPosition()));
    addPlayer(new Player("Cafu", "Moreira", 50, 2, 8.8, 8.0, 1.76, 8.1, getInitialPosition()));
    addPlayer(new Player("Paolo", "Maldini", 53, 3, 8.5, 8.5, 1.87, 7.5, getInitialPosition()));
    addPlayer(new Player("Carles", "Puyol", 43, 5, 7.9, 8.8, 1.80, 7.8, getInitialPosition()));
  }

  private void addPlayer(Player player) {
    this.players.add(player);
  }

  private static Point getInitialPosition() {
    return new Point(10, (15 * playersCount++));
  }

  public List<Player> getTeam() {
    return players;
  }

  public Player searchPlayer(String name) {
    for (Player player : this.players) {
      if(player.getName().equals(name)) {
        return player;
      }
    }
    return null;
  }
}
