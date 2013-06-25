package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

import com.spun.util.NumberUtils;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    //lower the y coordinate by 100
    turtle.setY(turtle.getY() + 100);
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int branchlength = 60;
    int turningamount = 360;
    for (int i = 1; i <= 360 / turningamount; i++)
    {
      drawBranch(turtle, branchlength);
      turtle.turn(turningamount);
    }
  }
  public static void drawBranch(Turtle turtle, int branchlength)
  {
    if (0 < branchlength)
    {
      adjustColor(turtle, branchlength);
      turtle.move(branchlength);
      drawLowerBranches(turtle, branchlength);
    }
  }
  public static void adjustColor(Turtle turtle, int branchlength)
  {
    if (branchlength == 10)
    {
      turtle.setPenWidth(1);
      turtle.setPenColor(Colors.Purples.Purple);
    }
    else if (branchlength <= 20)
    {
      turtle.setPenWidth(2);
      turtle.setPenColor(Colors.Whites.White);
    }
    else if (branchlength <= 30)
    {
      turtle.setPenWidth(3);
      turtle.setPenColor(Colors.Greens.MediumSpringGreen);
    }
    else if (branchlength <= 40)
    {
      turtle.setPenWidth(5);
      turtle.setPenColor(Colors.Greens.Green);
    }
    else if (branchlength <= 50)
    {
      turtle.setPenWidth(7);
      turtle.setPenColor(Colors.Blues.CornflowerBlue);
    }
    else if (branchlength <= 60)
    {
      turtle.setPenWidth(10);
      turtle.setPenColor(Colors.Yellows.Gold);
    }
  }
  public static void drawLowerBranches(Turtle turtle, int branchlength)
  {
    int rightAngle = NumberUtils.getRandomInt(10, 60);
    turtle.turn(rightAngle);
    drawShorterBranch(turtle, branchlength);
    int leftAngle = NumberUtils.getRandomInt(10, 60);
    turtle.turn(leftAngle - rightAngle);
    drawShorterBranch(turtle, branchlength);
    turtle.turn(-leftAngle);
    adjustColor(turtle, branchlength);
    turtle.move(-branchlength);
  }
  public static void drawShorterBranch(Turtle turtle, int branchlength)
  {
    int difference = 10;
    drawBranch(turtle, branchlength - difference);
  }
}