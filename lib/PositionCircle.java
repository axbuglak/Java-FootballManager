package lib;

import java.awt.Point;

class PositionCircle {
  int key;
  int x, y, radius;
  String team;
  String player = "";

  PositionCircle(int key, int x, int y, int radius, String team) {
    this.key = key;
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.team = team;
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

}