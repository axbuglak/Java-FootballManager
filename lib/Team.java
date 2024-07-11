package lib;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Team {
  private List<Player> players = new ArrayList<Player>();
  private static int playersCount = 0;

  public Team() {
    // Goalkeepers
    addPlayer(new Player("Manuel", "Neuer", 35, 1, 7.0, 8.5, 1.93, 8.0, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("Alisson", "Becker", 29, 1, 7.5, 8.0, 1.91, 7.5, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("Jan", "Oblak", 29, 13, 6.5, 8.5, 1.88, 8.5, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("Ederson", "Moraes", 28, 31, 7.0, 7.5, 1.88, 8.0, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("Thibaut", "Courtois", 29, 1, 6.5, 8.5, 1.99, 8.0, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("David", "De Gea", 31, 1, 6.5, 7.5, 1.92, 8.0, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("Hugo", "Lloris", 35, 1, 6.0, 7.0, 1.88, 7.5, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("Samir", "Handanovic", 37, 1, 6.5, 7.5, 1.93, 7.5, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("Gianluigi", "Donnarumma", 23, 99, 7.5, 8.0, 1.96, 8.5, getInitialPosition(), "goalkeeper"));
    addPlayer(new Player("Marc-André", "ter Stegen", 30, 1, 7.0, 7.5, 1.87, 8.0, getInitialPosition(), "goalkeeper"));
    playersCount = 0;
    // Center-backs
    addPlayer(new Player("Sergio", "Ramos", 35, 4, 6.5, 8.0, 1.84, 7.5, getInitialPosition(), "center-back"));
    addPlayer(new Player("Gerard", "Pique", 34, 3, 6.0, 8.0, 1.94, 7.0, getInitialPosition(), "center-back"));
    addPlayer(new Player("Virgil", "van Dijk", 30, 4, 7.0, 8.5, 1.93, 8.0, getInitialPosition(), "center-back"));
    addPlayer(new Player("Kalidou", "Koulibaly", 30, 26, 6.5, 8.5, 1.87, 7.0, getInitialPosition(), "center-back"));
    addPlayer(new Player("Raphael", "Varane", 28, 19, 6.0, 8.0, 1.91, 7.5, getInitialPosition(), "center-back"));
    addPlayer(new Player("Matthijs", "de Ligt", 22, 4, 7.0, 8.0, 1.89, 8.0, getInitialPosition(), "center-back"));
    addPlayer(new Player("Leonardo", "Bonucci", 34, 19, 6.5, 8.0, 1.90, 7.5, getInitialPosition(), "center-back"));
    addPlayer(new Player("Mats", "Hummels", 33, 15, 6.0, 7.5, 1.91, 7.0, getInitialPosition(), "center-back"));
    addPlayer(new Player("Aymeric", "Laporte", 28, 14, 6.5, 7.5, 1.91, 7.5, getInitialPosition(), "center-back"));
    addPlayer(new Player("John", "Stones", 27, 5, 6.5, 7.5, 1.88, 7.0, getInitialPosition(), "center-back"));
    playersCount = 0;
    // Right-midfielders
    addPlayer(
        new Player("Trent", "Alexander-Arnold", 23, 66, 8.5, 7.0, 1.75, 8.5, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("Joshua", "Kimmich", 26, 6, 8.0, 7.5, 1.76, 8.5, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("Achraf", "Hakimi", 22, 2, 8.0, 7.0, 1.81, 8.0, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("Kyle", "Walker", 31, 2, 7.5, 8.0, 1.83, 7.5, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("Dani", "Carvajal", 30, 2, 7.0, 7.5, 1.73, 7.0, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("João", "Cancelo", 27, 27, 8.0, 7.5, 1.82, 8.0, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("Ricardo", "Pereira", 28, 21, 7.0, 7.0, 1.75, 7.0, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("Reece", "James", 22, 24, 8.0, 7.5, 1.82, 8.0, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("Serge", "Aurier", 29, 24, 7.0, 7.5, 1.76, 7.0, getInitialPosition(), "right-midfielder"));
    addPlayer(new Player("Kieran", "Trippier", 31, 12, 7.5, 7.5, 1.78, 7.5, getInitialPosition(), "right-midfielder"));
    playersCount = 0;

    // Left-midfielders
    addPlayer(new Player("Andrew", "Robertson", 27, 26, 8.0, 7.5, 1.78, 8.0, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Jordi", "Alba", 32, 18, 8.0, 7.0, 1.70, 7.5, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Theo", "Hernandez", 24, 19, 8.5, 7.5, 1.84, 8.0, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Alphonso", "Davies", 21, 19, 9.0, 7.0, 1.83, 8.5, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Ferland", "Mendy", 26, 23, 7.5, 7.5, 1.80, 7.5, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Lucas", "Hernandez", 25, 21, 7.5, 7.5, 1.84, 7.5, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Marcos", "Alonso", 31, 3, 7.0, 7.5, 1.88, 7.0, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Ben", "Chilwell", 25, 21, 7.5, 7.5, 1.80, 7.5, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Alex", "Sandro", 31, 12, 7.0, 7.0, 1.80, 7.0, getInitialPosition(), "left-midfielder"));
    addPlayer(new Player("Nicolas", "Tagliafico", 29, 3, 7.0, 7.0, 1.72, 7.0, getInitialPosition(), "left-midfielder"));
    playersCount = 0;

    // Central-midfielders
    addPlayer(new Player("Luka", "Modric", 36, 10, 7.5, 7.0, 1.72, 9.0, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("N'Golo", "Kante", 30, 7, 8.0, 8.0, 1.68, 8.5, getInitialPosition(), "central-midfielder"));
    addPlayer(
        new Player("Kevin", "De Bruyne", 30, 17, 7.5, 7.5, 1.81, 9.5, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Paul", "Pogba", 28, 6, 7.0, 8.0, 1.91, 8.0, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Toni", "Kroos", 31, 8, 6.5, 7.0, 1.83, 8.5, getInitialPosition(), "central-midfielder"));
    addPlayer(
        new Player("Frenkie", "de Jong", 24, 21, 7.5, 7.0, 1.80, 8.5, getInitialPosition(), "central-midfielder"));
    addPlayer(
        new Player("Thiago", "Alcantara", 30, 6, 7.0, 7.0, 1.74, 8.0, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Marco", "Verratti", 28, 6, 7.5, 7.0, 1.65, 8.0, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Jorginho", "Frello", 30, 5, 7.0, 7.5, 1.80, 8.0, getInitialPosition(), "central-midfielder"));
    addPlayer(
        new Player("Bruno", "Fernandes", 27, 18, 7.5, 7.0, 1.79, 8.5, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Fabinho", "Tavares", 28, 3, 7.5, 8.0, 1.88, 8.0, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Saul", "Niguez", 26, 17, 7.0, 7.5, 1.84, 7.5, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Miralem", "Pjanic", 31, 5, 7.0, 7.0, 1.80, 8.0, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Declan", "Rice", 22, 41, 7.5, 7.5, 1.85, 7.5, getInitialPosition(), "central-midfielder"));
    addPlayer(new Player("Franck", "Kessie", 25, 79, 7.5, 8.0, 1.83, 7.5, getInitialPosition(), "central-midfielder"));
    playersCount = 0;

    // Right-forwards
    addPlayer(new Player("Cristiano", "Ronaldo", 36, 7, 9.0, 8.5, 1.87, 9.0, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Kylian", "Mbappe", 22, 7, 9.5, 8.0, 1.78, 8.5, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Robert", "Lewandowski", 33, 9, 8.0, 8.5, 1.84, 9.0, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Erling", "Haaland", 21, 9, 8.5, 8.0, 1.94, 8.5, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Romelu", "Lukaku", 28, 9, 8.0, 9.0, 1.91, 8.0, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Harry", "Kane", 28, 10, 8.0, 8.0, 1.88, 8.5, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Luis", "Suarez", 35, 9, 7.5, 8.0, 1.82, 8.0, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Zlatan", "Ibrahimovic", 40, 11, 7.0, 9.0, 1.95, 8.0, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Mauro", "Icardi", 28, 9, 7.5, 8.0, 1.81, 8.0, getInitialPosition(), "right-forward"));
    addPlayer(new Player("Sergio", "Aguero", 33, 10, 7.5, 7.5, 1.73, 8.5, getInitialPosition(), "right-forward"));
    playersCount = 0;

    // Left-forwards
    addPlayer(new Player("Lionel", "Messi", 34, 10, 9.5, 8.0, 1.70, 9.0, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Neymar", "Jr", 29, 10, 8.5, 7.5, 1.75, 9.0, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Karim", "Benzema", 34, 9, 8.0, 8.0, 1.85, 8.5, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Antoine", "Griezmann", 30, 7, 8.0, 7.5, 1.76, 8.0, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Raheem", "Sterling", 27, 7, 8.5, 7.0, 1.70, 8.0, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Eden", "Hazard", 31, 7, 8.0, 7.0, 1.75, 8.5, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Son", "Heung-min", 29, 7, 8.5, 7.0, 1.83, 8.5, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Paulo", "Dybala", 28, 10, 8.0, 7.0, 1.77, 8.5, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Lorenzo", "Insigne", 30, 24, 8.5, 7.0, 1.63, 8.0, getInitialPosition(), "left-forward"));
    addPlayer(new Player("Marco", "Reus", 32, 11, 8.0, 7.0, 1.80, 8.0, getInitialPosition(), "left-forward"));
    playersCount = 0;

    // Right-defenders
    addPlayer(
        new Player("Trent", "Alexander-Arnold", 23, 66, 8.5, 7.0, 1.75, 8.5, getInitialPosition(), "right-defender"));
    addPlayer(new Player("Kyle", "Walker", 31, 2, 7.5, 8.0, 1.83, 7.5, getInitialPosition(), "right-defender"));
    addPlayer(new Player("Dani", "Carvajal", 30, 2, 7.0, 7.5, 1.73, 7.0, getInitialPosition(), "right-defender"));
    addPlayer(new Player("João", "Cancelo", 27, 27, 8.0, 7.5, 1.82, 8.0, getInitialPosition(), "right-defender"));
    addPlayer(new Player("Ricardo", "Pereira", 28, 21, 7.0, 7.0, 1.75, 7.0, getInitialPosition(), "right-defender"));
    addPlayer(new Player("Reece", "James", 22, 24, 8.0, 7.5, 1.82, 8.0, getInitialPosition(), "right-defender"));
    addPlayer(new Player("Serge", "Aurier", 29, 24, 7.0, 7.5, 1.76, 7.0, getInitialPosition(), "right-defender"));
    addPlayer(new Player("Kieran", "Trippier", 31, 12, 7.5, 7.5, 1.78, 7.5, getInitialPosition(), "right-defender"));
    addPlayer(new Player("Hector", "Bellerin", 27, 2, 7.5, 7.0, 1.78, 7.5, getInitialPosition(), "right-defender"));
    addPlayer(new Player("Cesar", "Azpilicueta", 32, 28, 7.0, 7.5, 1.78, 7.0, getInitialPosition(), "right-defender"));
    playersCount = 0;

    // Center-defenders
    addPlayer(new Player("Sergio", "Ramos", 35, 4, 6.5, 8.0, 1.84, 7.5, getInitialPosition(), "center-defender"));
    addPlayer(new Player("Gerard", "Pique", 34, 3, 6.0, 8.0, 1.94, 7.0, getInitialPosition(), "center-defender"));
    addPlayer(new Player("Virgil", "van Dijk", 30, 4, 7.0, 8.5, 1.93, 8.0, getInitialPosition(), "center-defender"));
    addPlayer(new Player("Kalidou", "Koulibaly", 30, 26, 6.5, 8.5, 1.87, 7.0, getInitialPosition(), "center-defender"));
    addPlayer(new Player("Raphael", "Varane", 28, 19, 6.0, 8.0, 1.91, 7.5, getInitialPosition(), "center-defender"));
    addPlayer(new Player("Matthijs", "de Ligt", 22, 4, 7.0, 8.0, 1.89, 8.0, getInitialPosition(), "center-defender"));
    addPlayer(new Player("Leonardo", "Bonucci", 34, 19, 6.5, 8.0, 1.90, 7.5, getInitialPosition(), "center-defender"));
    addPlayer(new Player("Mats", "Hummels", 33, 15, 6.0, 7.5, 1.91, 7.0, getInitialPosition(), "center-defender"));
    addPlayer(new Player("Aymeric", "Laporte", 28, 14, 6.5, 7.5, 1.91, 7.5, getInitialPosition(), "center-defender"));
    addPlayer(new Player("John", "Stones", 27, 5, 6.5, 7.5, 1.88, 7.0, getInitialPosition(), "center-defender"));
    playersCount = 0;

    // Left-defenders
    addPlayer(new Player("Andrew", "Robertson", 27, 26, 8.0, 7.5, 1.78, 8.0, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Jordi", "Alba", 32, 18, 8.0, 7.0, 1.70, 7.5, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Theo", "Hernandez", 24, 19, 8.5, 7.5, 1.84, 8.0, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Alphonso", "Davies", 21, 19, 9.0, 7.0, 1.83, 8.5, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Ferland", "Mendy", 26, 23, 7.5, 7.5, 1.80, 7.5, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Lucas", "Hernandez", 25, 21, 7.5, 7.5, 1.84, 7.5, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Marcos", "Alonso", 31, 3, 7.0, 7.5, 1.88, 7.0, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Ben", "Chilwell", 25, 21, 7.5, 7.5, 1.80, 7.5, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Alex", "Sandro", 31, 12, 7.0, 7.0, 1.80, 7.0, getInitialPosition(), "left-defender"));
    addPlayer(new Player("Nicolas", "Tagliafico", 29, 3, 7.0, 7.0, 1.72, 7.0, getInitialPosition(), "left-defender"));
  }

  private void addPlayer(Player player) {
    this.players.add(player);
  }

  private synchronized static Point getInitialPosition() {
    return new Point(2, (25 * playersCount++) + 360);
  }

  public List<Player> getTeam() {
    return players;
  }

  public Player searchPlayer(String name) {
    for (Player player : this.players) {
      if (player.getName().equals(name)) {
        return player;
      }
    }
    return null;
  }
}
