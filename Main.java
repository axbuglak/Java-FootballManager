import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
      frame.setLayout(new BorderLayout());
      BufferedImage backgroundImage = ImageIO.read(new File("./footballPitch2.jpg"));
      JLabel label = new JLabel("Click on the position to select a player");
      CustomCanvas canvas = new CustomCanvas(backgroundImage, field, team, label);
      JButton button = new JButton("Click Me");
      button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          label.setText(field.getResults());
        }
      });
      frame.add(button, BorderLayout.SOUTH);
      frame.add(canvas, BorderLayout.CENTER);
      frame.add(label, BorderLayout.NORTH);
      frame.setSize(backgroundImage.getWidth(), backgroundImage.getHeight() + 50);
      frame.setVisible(true);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}