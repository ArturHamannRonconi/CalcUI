package models;

import java.util.ArrayList;
import java.util.List;

public class Calculator
{
  private List<Integer> digits = new ArrayList<>();
  private List<Character> operations = new ArrayList<>();
  private Integer memory = 0;

  public Calculator()
  {
    setDigits();
    setOperations();
  }

  public List<Integer> getDigits()
  {
    return digits;
  }
  public List<Character> getOperations()
  {
    return operations;
  }

  private void setDigits()
  {
    for(Integer digit = 0; digit < 10; digit++)
      digits.add(digit);
  }
  private void setOperations()
  {
    operations.add('+');
    operations.add('-');
    operations.add('*');
    operations.add('/');
    operations.add('=');
  }

  public Integer getMemory()
  {
    return memory;
  }
  public void addToMemory(Integer number)
  {
    memory += number;
  }
  public void subtractForMemory(Integer number)
  {
    memory -= number;
  }
  public void multiplyMemory(Integer number)
  {
    memory *= number;
  }
  public void divideMemory(Integer number)
  {
    memory /= number;
  }
}