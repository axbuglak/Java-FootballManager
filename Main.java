import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

import fields.StandartField;
import lib.*;
import fields.Field;

public class Main {
  private static JFrame frame;

  public static void main(String[] args) {
    Team team = new Team();
    Field field = new StandartField();
    try {
      frame = new JFrame("Football game");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      BufferedImage backgroundImage = ImageIO.read(new File("./footballPitch2.jpg"));
      CustomCanvas canvas = new CustomCanvas(backgroundImage, field, team);
      frame.add(canvas);
      frame.setSize(backgroundImage.getWidth(), backgroundImage.getHeight());
      frame.setVisible(true);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}