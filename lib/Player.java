package lib;


import java.awt.Point;

public class Player {
  public String name, surname, team;
  public int old, number;
  public double speed, strength, height, technik;
  public Point position, startPosition;


  public Player(String name, String surname, int old, int number, double speed, double strength,
      double height, double technik, Point initialPosition) {
    this.name = name;
    this.surname = surname;
    this.old = old;
    this.number = number;
    this.speed = speed;
    this.strength = strength;
    this.height = height;
    this.technik = technik;
    this.setStartPosition(initialPosition);
  }

  public String getName() {
    return String.format("%s %s", name, surname);
  }

  public int getOld() {
    return old;
  }

  public int getNumber() {
    return number;
  }

  public double getStats() {
    return (this.old + this.height + this.speed + this.strength + this.technik) / 5;
  }
  
  public void setStartPosition(Point startPosition) {
    this.position = new Point(startPosition);
    this.startPosition = startPosition;
  }

  public void setPosition(double x, double y) {
    this.position.setLocation(x, y);
  }

  public void resetPosition() {
    position.setLocation(startPosition);
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getTeam() {
    return team;
  }
}
