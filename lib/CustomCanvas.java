package lib;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fields.Field;
import lib.CustomCanvas;

public class CustomCanvas extends Canvas {
  private BufferedImage backgroundImage;
  private Player draggedPlayer = null;
  private ArrayList<PositionCircle> circles = new ArrayList<PositionCircle>();
  private static HashMap<Integer, Integer[]> firstTeamPosition;
  private static HashMap<Integer, Integer[]> secondTeamPosition;
  private static List<Player> teamPlayers = new ArrayList<Player>();
  private static Field field;
  private static Team team;

  public CustomCanvas(BufferedImage backgroundImage, Field choosedField, Team choosedTeam) {
    field = choosedField;
    firstTeamPosition = field.getPositionsFirst();
    secondTeamPosition = field.getPositionsSecond();
    team = choosedTeam;
    teamPlayers = team.getTeam();
    this.backgroundImage = backgroundImage;
    firstTeamPosition.forEach((key, value) -> {
      PositionCircle circle = new PositionCircle(key, value[0], value[1], 20, "first");
      circles.add(circle);
    });
    secondTeamPosition.forEach((key, value) -> {
      PositionCircle circle = new PositionCircle(key, value[0], value[1], 20, "second");
      circles.add(circle);
    });
    addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        for (Player player : teamPlayers) {
          if (isInsideText(e.getPoint(), player)) {
            draggedPlayer = player;
            break;
          }
        }
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        if (draggedPlayer == null) {
          return;
        }
        boolean insidePositionCircle = false;
        for (PositionCircle circle : circles) {
          if (circle.contains(draggedPlayer.position)) {
            insidePositionCircle = true;
            handlePlayerPosition(circle, draggedPlayer);
            break;
          }
        }
        if (!insidePositionCircle) {
          draggedPlayer.resetPosition();
        }
        draggedPlayer = null;
        repaint();
      }
    });

    addMouseMotionListener(new MouseAdapter() {
      @Override
      public void mouseDragged(MouseEvent e) {
        if (draggedPlayer == null) {
          return;
        }
        draggedPlayer.setPosition(e.getX(), e.getY());
        repaint();
      }
    });
  }

  public void handlePlayerPosition(PositionCircle position, Player player) {
    if (position.getPlayer() != player.getName()) {
      Player oldPositionPlayer = team.searchPlayer(position.getPlayer());
      if (oldPositionPlayer != null) {
        oldPositionPlayer.resetPosition();
        field.removePlayerFromGame(player);
      }
    }
    player.setTeam(position.team);
    field.setPlayerInGame(player, position.key);
    position.setPlayer(player.getName());
    System.out.println(position.player);
    repaint();
  }

  private boolean isInsideText(Point point, Player player) {
    return point.x >= player.position.x && point.x <= player.position.x + 50 &&
        point.y >= player.position.y - 10 && point.y <= player.position.y + 10;
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g.drawImage(backgroundImage, 0, 0, this);

    for (PositionCircle circle : circles) {
      g.setColor(new Color(255, 0, 0));
      g.drawOval(circle.x - circle.radius, circle.y - circle.radius, circle.radius * 2, circle.radius * 2);
    }
    g.setColor(Color.BLACK);
    for (Player player : teamPlayers) {
      g.drawString(player.getName() + " " + player.getNumber(), player.position.x, player.position.y);
    }

  }
}