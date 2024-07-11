package lib;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

import fields.Field;
import lib.CustomCanvas;

public class CustomCanvas extends Canvas {
  private BufferedImage backgroundImage;
  private Player draggedPlayer = null;
  private ArrayList<PositionCircle> circles = new ArrayList<PositionCircle>();
  private static List<Player> teamPlayers = new ArrayList<Player>();
  private static Field field;
  private static Team team;
  private static JLabel label;
  private static String choosedRole = "";

  public CustomCanvas(BufferedImage backgroundImage, Field choosedField, Team choosedTeam, JLabel textLabel) {
    field = choosedField;
    label = textLabel;
    team = choosedTeam;
    circles = field.getPositions();
    teamPlayers = team.getTeam();
    this.backgroundImage = backgroundImage;
    addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        for (PositionCircle circle : circles) {
          if (circle.contains(e.getPoint())) {
            choosedRole = circle.getRole() + circle.getTeam();
            draggedPlayer = null;
            repaint();
            return;
          }
        }
        for (Player player : teamPlayers) {
          if (choosedRole.startsWith(player.getRole()) && isInsideText(e.getPoint(), player)) {
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
    if (!(player.getRole() + position.getTeam()).equals(choosedRole)) {
      label.setText(String.format("You should choose player for %s team", choosedRole));
      player.resetPosition();
      return;
    }
    if (position.getPlayer() != player.getName() && position.getPlayer() != "") {
      Player oldPositionPlayer = team.searchPlayer(position.getPlayer());
      if (oldPositionPlayer != null) {
        oldPositionPlayer.resetPosition();
        field.removePlayerFromGame(oldPositionPlayer);
      }
    }
    player.setTeam(position.team);
    field.setPlayerInGame(player, position.key);
    position.setPlayer(player.getName());
    repaint();
  }

  private boolean isInsideText(Point point, Player player) {
    return point.x >= player.position.x && point.x <= player.position.x + 50 &&
        point.y >= player.position.y - 10 && point.y <= player.position.y + 10;
  }

  @Override
  public void paint(Graphics g) {
    if (choosedRole != "") {
      label.setText(String.format("Pick player for role %s from the list", choosedRole));
    }
    super.paint(g);
    g.drawImage(backgroundImage, 0, 0, this);

    for (PositionCircle circle : circles) {
      if((circle.getRole() + circle.getTeam()).equals(choosedRole)) {
        g.setColor(new Color(0, 255, 0));
      } else {
        g.setColor(circle.player != "" ? new Color(255, 0, 0) : new Color(0, 0, 255));
      }
      g.drawOval(circle.x - circle.radius, circle.y - circle.radius, circle.radius * 2, circle.radius * 2);
    }
    g.setColor(Color.BLACK);
    g.setFont(getFont().deriveFont(Font.BOLD, 16)); 
    for (Player player : teamPlayers) {
      if (choosedRole.startsWith(player.getRole()) || player.getTeam() != "" || player.equals(draggedPlayer)) {
        g.drawString(player.getName() + " " + player.getNumber(), player.position.x, player.position.y);
      }
    }

  }
}