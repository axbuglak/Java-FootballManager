import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class FootballGame {

  public static void main(String[] args) {
    new FootballGame();
  }

  public FootballGame() {
    try {
      JFrame frame = new JFrame("Football game");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      BufferedImage backgroundImage = ImageIO.read(new File("./footballPitch2.jpg"));
      CustomCanvas canvas = new CustomCanvas(backgroundImage);
      frame.add(canvas);
      frame.setSize(backgroundImage.getWidth(), backgroundImage.getHeight());
      frame.setVisible(true);
      canvas.repaint();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  class Circle {
    int key;
    int x, y, radius;

    Circle(int key, int x, int y, int radius) {
      this.key = key;
      this.x = x;
      this.y = y;
      this.radius = radius;
    }

    boolean contains(Point p) {
      return Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2) <= Math.pow(radius, 2);
    }
  }

  class TextMessage {
    String text;
    Point position;
    Point initialPosition;

    TextMessage(String text, Point initialPosition) {
      this.text = text;
      this.position = new Point(initialPosition);
      this.initialPosition = initialPosition;
    }

    void resetPosition() {
      position.setLocation(initialPosition);
    }
  }

  class CustomCanvas extends Canvas {
    private BufferedImage backgroundImage;
    private List<TextMessage> textMessages;
    private TextMessage draggedText = null;
    private Circle[] circles = {
        new Circle(1, 79, 70, 20),
        new Circle(2, 220, 220, 20)
    };

    public CustomCanvas(BufferedImage backgroundImage) {
      this.backgroundImage = backgroundImage;

      textMessages = new ArrayList<>();
      textMessages.add(new TextMessage("Hello 1", new Point(10, 20)));
      textMessages.add(new TextMessage("Hello 2", new Point(10, 40)));
      textMessages.add(new TextMessage("Hello 3", new Point(10, 60)));

      addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
          for (TextMessage textMessage : textMessages) {
            if (isInsideText(e.getPoint(), textMessage)) {
              draggedText = textMessage;
              break;
            }
          }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
          if (draggedText != null) {
            boolean insideCircle = false;

            for (Circle circle : circles) {
              if (circle.contains(draggedText.position)) {
                insideCircle = true;
                onTextDroppedIntoCircle(circle.key, draggedText.text);
                break;
              }
            }

            if (!insideCircle) {
              draggedText.resetPosition();
            }

            draggedText = null;
            repaint();
          }
        }
      });

      addMouseMotionListener(new MouseAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
          if (draggedText != null) {
            draggedText.position.setLocation(e.getX(), e.getY());
            repaint();
          }
        }
      });
    }

    private boolean isInsideText(Point point, TextMessage textMessage) {
      return point.x >= textMessage.position.x && point.x <= textMessage.position.x + 50 &&
          point.y >= textMessage.position.y - 10 && point.y <= textMessage.position.y + 10;
    }

    private void onTextDroppedIntoCircle(int circleKey, String text) {
      System.out.println("Text '" + text + "' dropped into circle with key: " + circleKey);
    }

    @Override
    public void paint(Graphics g) {
      super.paint(g);
      g.drawImage(backgroundImage, 0, 0, this);

      for (Circle circle : circles) {
        g.setColor(circle.key == 1 ? new Color(255, 0, 0) : new Color(0, 0, 255));
        g.drawOval(circle.x - circle.radius, circle.y - circle.radius, circle.radius * 2, circle.radius * 2);
      }

      g.setColor(Color.BLACK);
      for (TextMessage textMessage : textMessages) {
        g.drawString(textMessage.text, textMessage.position.x, textMessage.position.y);
      }
    }
  }
}
