package players;

public class Player {
  private String name, surname;
  private int old, number, position;
  private double speed, strength, height, technik;

  public Player(String name, String surname, int old, int position, int number, double speed, double strength,
      double height, double technik) {
    this.name = name;
    this.surname = surname;
    this.old = old;
    this.number = number;
    setPosition(position);
    this.speed = speed;
    this.strength = strength;
    this.height = height;
    this.technik = technik;
  }

  public String getName() {
    return String.format("%s %s", name, surname);
  }

  public int getOld() {
    return old;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public int getPosition() {
    return position;
  }

  public int getNumber() {
    return number;
  }

  public double getStats() {
    return (this.old + this.height + this.speed + this.strength + this.technik) / 5;
  }
}
