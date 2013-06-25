package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setSpeed(8);
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int branchlength = 60;
    drawBranch(turtle, branchlength);
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
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    if (branchlength == 30)
    {
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    if (branchlength == 40)
    {
      turtle.setPenColor(Colors.Greens.Olive);
    }
    if (branchlength == 50)
    {
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    if (branchlength == 60)
    {
      turtle.setPenColor(Colors.Browns.SaddleBrown);
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