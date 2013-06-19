package org.teachingkidsprogramming.recipes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare extends JFrame implements KeyListener, ActionListener
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.getBackgroundWindow().setBounds(
        new Rectangle(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit()
            .getScreenSize().height));
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    Tortoise.setSpeed(10);
    Tortoise.turn(MessageBox.askForNumericalInput("Initial Rotation"));
    Tortoise.setX(MessageBox.askForNumericalInput("X Pos"));
    Tortoise.setY(MessageBox.askForNumericalInput("Y Pos"));
    new SimpleSquare().moveMe();
  }
  SimpleSquare()
  {
    super();
  }
  public void moveMe()
  {
    int penWidth = 5;
    float hue = 0;
    int angle = 15;
    int move = 1;
    while (true)
    {
      Tortoise.setPenWidth(penWidth);
      Tortoise.setPenColor(Color.getHSBColor(hue, 1, 1));
      Tortoise.move(move);
      Tortoise.turn(angle);
      //penWidth++;
      hue += .01;
      if (hue > 1)
      {
        hue = 0;
      }
      angle += 1;
      if (move < 20)
        move++;
      else
        move--;
      repaint();
    }
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.BLACK);
    g.drawString("testas;dlfja;sldkfj", 100, 100);
  }
  @Override
  public void keyPressed(KeyEvent e)
  {
    // TODO Auto-generated method stub
  }
  @Override
  public void keyReleased(KeyEvent e)
  {
    // TODO Auto-generated method stub
  }
  @Override
  public void keyTyped(KeyEvent e)
  {
    // TODO Auto-generated method stub
  }
  @Override
  public void actionPerformed(ActionEvent e)
  {
    // TODO Auto-generated method stub
  }
}
