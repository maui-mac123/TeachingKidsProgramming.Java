package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int branchlength = 60;
    int turningamount = 10;
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
      turtle.setPenColor(Colors.Greens.Lime);
    }
    if (branchlength == 20)
    {
      turtle.setPenColor(Colors.Whites.White);
    }
    if (branchlength == 30)
    {
      turtle.setPenColor(Colors.Greens.MediumSpringGreen);
    }
    if (branchlength == 40)
    {
      turtle.setPenColor(Colors.Greens.Green);
    }
    if (branchlength == 50)
    {
      turtle.setPenColor(Colors.Blues.CornflowerBlue);
    }
    if (branchlength == 60)
    {
      turtle.setPenColor(Colors.Yellows.Gold);
    }
  }
  public static void drawLowerBranches(Turtle turtle, int branchlength)
  {
    turtle.turn(30);
    drawShorterBranch(turtle, branchlength);
    turtle.turn(-60);
    drawShorterBranch(turtle, branchlength);
    turtle.turn(30);
    adjustColor(turtle, branchlength);
    turtle.move(-branchlength);
  }
  public static void drawShorterBranch(Turtle turtle, int branchlength)
  {
    drawBranch(turtle, branchlength - 10);
  }
}