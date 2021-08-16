package components;

import javax.swing.*;
import java.awt.*;

public class Key extends JButton
{
  public static final int MAX_POSITION_X_DIGIT = 370;

  private final Font fontFamily = new Font("Arial", Font.BOLD, 18);
  private final int height = 50;
  private final int width = 50;

  private static int positionX = 50;
  private static int positionY = 180;  
  private Screen screen;

  public Key(String symbol, Screen screen)
  {
    super(symbol);
    this.screen = screen;
    setBounds(positionX, positionY, width, height);
    setFont(fontFamily);
  }

  public void addPositionX()
  {
    positionX += 80;
  }
  public void addPositionY()
  {
    positionY += 80;
  }

  public static int getPositionX()
  {
    return positionX;
  }
  public void resetPositionX()
  {
    positionX = 50;
  }

  public Screen getScreen()
  {
    return screen;
  }
}