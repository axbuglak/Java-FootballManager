import fields.Field;
import fields.StandartField;
import players.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

class Main  {
  private static ArrayList<Player> players = new ArrayList<Player>();
  private static JFrame frame;

  public static void main(String[] args) {
    players = new Team().getTeam();
    Field field = new StandartField(players);
    HashMap<Integer, Integer[]> position = field.getPositions();
    position.forEach((key, value) -> {
      System.out.println(value);
    });
    drawField();
    frame.pack();
    frame.setVisible(true);
  }

  private static void drawField() {
    try {
      frame = new JFrame("Football game");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout());
      JLabel label = new JLabel(new ImageIcon(ImageIO.read(new File("./footballPitch2.jpg"))));
      frame.setContentPane(label);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void boxOval(Graphics g, Rectangle bb) {
    g.fillOval(bb.x, bb.y, bb.width, bb.height);
  }

  private static void drawPosition(Graphics g, Rectangle bb) {
    boxOval(g, bb);

    int dx = bb.width / 2;
    int dy = bb.height / 2;
    Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

    half.translate(-dx / 2, -dy / 2);
    boxOval(g, half);

    half.translate(dx * 2, 0);
    boxOval(g, half);
  }
}
