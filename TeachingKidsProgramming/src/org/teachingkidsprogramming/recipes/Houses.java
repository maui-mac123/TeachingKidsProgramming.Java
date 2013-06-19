package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height, Colors.Grays.LightGray);
    drawHouse(120, Colors.Grays.LightGray);
    drawHouse(90, Colors.Grays.LightGray);
    drawHouse(20, Colors.Grays.LightGray);
  }
  private static void drawHouse(int height, Color color)
  {
    Tortoise.setPenColor(color);
    Tortoise.move(height);
    // flatRoof();
    //amittasisRoof();
    //MavericksRoof
    //turn Left 90
    Tortoise.turn(-90);
    //move 10
    Tortoise.move(10);
    //turn right 90+45
    Tortoise.turn(90 + 45);
    //move 50
    Tortoise.move(50);
    //turn 90
    Tortoise.turn(90);
    // move 50
    Tortoise.move(50);
    // turn 90 + 45
    Tortoise.turn(90 + 45);
    // move 10 
    Tortoise.move(10);
    // turn 90 left
    Tortoise.turn(-90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void amittasisRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(90);
    Tortoise.move(10);
    Tortoise.turn(45);
  }
  private static void flatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
