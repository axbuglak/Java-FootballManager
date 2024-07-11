package lib;

import java.awt.Point;

public class PositionCircle {
  int key, x, y, radius;
  String team, player = "", role;

  public PositionCircle(int key, int x, int y, int radius, String team, String role) {
    this.key = key;
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.team = team;
    this.role = role;
  }

  boolean contains(Point p) {
    return Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2) <= Math.pow(radius, 2);
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public String getPlayer() {
    return player;
  }

  public String getRole() {
    return role;
  }

  public String getTeam() {
    return team;
  }
}