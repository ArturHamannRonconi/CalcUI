import components.*;
import models.*;

public class App {
  public static void main(String[] args) {
    var frame = new Frame();
    var screen = new Screen();
    var calculator = new Calculator();
  
    calculator.getDigits().forEach(d -> {
      var key = new Key(d.toString(), screen);
      key.addPositionX();

      key.addActionListener(e ->
        key.getScreen().setText(key.getScreen().getText() + d.toString())
      );

      if(Key.getPositionX() > Key.MAX_POSITION_X_DIGIT) {
        key.resetPositionX();
        key.addPositionY();
      }
      
      frame.add(key);
    });   
    calculator.getOperations().forEach(o -> {
      var key = new Key(o.toString(), screen);

      key.addActionListener(e -> {
        String operation = key.getText();
        if(operation.equals("=")) {
          key.getScreen().setText(calculator.getMemory().toString());
        } else {
          int number = Integer.parseInt(key.getScreen().getText());
  
          if(operation.equals("+"))
            calculator.addToMemory(number);
          if(operation.equals("-"))
            calculator.subtractForMemory(number);
          if(operation.equals("*"))
            calculator.multiplyMemory(number);
          if(operation.equals("/"))
            calculator.divideMemory(number);

          key.getScreen().setText("");
        }
      });

      frame.add(key);
      key.addPositionX();
    });

    frame.add(screen);
  }
}
