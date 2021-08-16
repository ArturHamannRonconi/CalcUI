package components;

import javax.swing.*;
import java.awt.*;

public class Screen extends JLabel
{
  private static final int POSITION_X = 50; 
  private static final int POSITION_Y = 30; 
  private static final int WIDTH      = 370;  
  private static final int HEIGHT     = 100;

  private static final Color   BACKGROUND  = new Color(220, 220, 220); 
  private static final Font    FONT_FAMILY = new Font("Arial", Font.BOLD, 40);
  private static final boolean OPAQUE      = true;
  
  public Screen()
  {
    setOpaque(Screen.OPAQUE);
    setBounds(
      Screen.POSITION_X, Screen.POSITION_Y,
      Screen.WIDTH, Screen.HEIGHT
    );
    setBackground(Screen.BACKGROUND);
    setFont(Screen.FONT_FAMILY);
  }  
}
