package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  private static int height = 40;
  private static int width  = 10;
  public static void main(String[] args)
  {
    //   Make the tortoise move as fast as possible --#11
    Tortoise.setSpeed(10);
    //   Have the tortoise start at 200 pixels in on the X axis --#14
    Tortoise.setX(200);
    drawHouse(40);
    //   ------------- End of drawHouse recipe
    //   DrawHouse with height 120 (recipe below) --#10
    drawHouse(120);
    //   DrawHouse with height 90 (recipe below) --#12
    drawHouse(90);
    //   DrawHouse with height 20 (recipe below) --#13
    drawHouse(20);
  }
  private static void drawHouse()
  {
    //   drawHouse (recipe below) --#9
    //   ------------- Recipe for drawHouse --#9
    //   Change the color of the line the tortoise draws to lightGray --#15
    Tortoise.move(height);
    //   Turn the tortoise 90 degrees to the right --#2
    Tortoise.turn(90);
    //   Move the tortoise 30 pixels --#3
    Tortoise.move(width);
    //   Turn the tortoise 90 degrees to the right --#4
    Tortoise.turn(90);
    //   Move the tortoise the height of a house --#5
    Tortoise.move(height);
    //   Turn the tortoise 90 degrees to the left --#6
    Tortoise.turn(270);
    //   Move the tortoise 20 pixels --#7
    Tortoise.move(20);
    //   Turn the tortoise 90 degrees to the left --#8
    Tortoise.turn(270);
    height += 40;
    //height *= -1;
    width += 20;
    drawHouse();
  }
  private static void drawHouse(int height)
  {
    //   drawHouse (recipe below) --#9
    //   ------------- Recipe for drawHouse --#9
    //   Change the color of the line the tortoise draws to lightGray --#15
    Tortoise.setPenColor(Colors.Grays.LightGray);
    Tortoise.move(height);
    //   Turn the tortoise 90 degrees to the right --#2
    Tortoise.turn(90);
    //   Move the tortoise 30 pixels --#3
    Tortoise.move(30);
    //   Turn the tortoise 90 degrees to the right --#4
    Tortoise.turn(90);
    //   Move the tortoise the height of a house --#5
    Tortoise.move(height);
    //   Turn the tortoise 90 degrees to the left --#6
    Tortoise.turn(270);
    //   Move the tortoise 20 pixels --#7
    Tortoise.move(20);
    //   Turn the tortoise 90 degrees to the left --#8
    Tortoise.turn(270);
  }
}
