package components;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame
{
  private static final int CENTER_X_SCREEN = 540;
  private static final int CENTER_Y_SCREEN = 100;
  private static final int FRAME_WIDTH     = 470;  
  private static final int FRAME_HEIGHT    = 440;

  private static final LayoutManager LAYOUT = null;
  private static final boolean VISIBILITY = true;

  public Frame()
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(Frame.VISIBILITY);
    setLayout(Frame.LAYOUT); 
    setBounds(
      Frame.CENTER_X_SCREEN,
      Frame.CENTER_Y_SCREEN,
      Frame.FRAME_WIDTH,
      Frame.FRAME_HEIGHT
    );
  }
}