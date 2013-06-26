package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    //    Show the tortoise --#1
    Tortoise.show();
    //    Make the tortoise move as fast as possible --#7
    Tortoise.setSpeed(10);
    //    Make the background silver --#8
    Tortoise.getBackgroundWindow().setBackground(Colors.Grays.Silver);
    {
      //    Make the line the tortoise draws 3 pixels wide --#20
      Tortoise.setPenWidth(3);
      //    createColorPalette (recipe below) --#9
      //    Do the following 15 times --#19
    }
    for (int i = 1; i <= 15; i++)
      //      drawOctogon (recipe below) --#10
      Tortoise.turn(90);
    Tortoise.move(50);
    for (int i = 1; i <= 8; i++)
    {
      Tortoise.turn(360 / 8);
      Tortoise.move(50);
    }
    //      Turn the tortoise 1/15th of 360 degrees to the right --#18
    Tortoise.turn(360 / 15);
    //    Repeat
    //    ------------- Recipe for createColorPalette --#9
    //    Color 1 is red --#3
    Tortoise.setPenColor(Colors.Reds.Red);
    //    Color 2 is dark orange --#11
    Tortoise.setPenColor(Colors.Oranges.DarkOrange);
    //    Color 3 is gold --#12
    Tortoise.setPenColor(Colors.Yellows.Gold);
    //    Color 4 is yellow --#13
    Tortoise.setPenColor(Colors.Yellows.Yellow);
    //    Add color 1 to the color wheel --#3.1
    ColorWheel.addColor(Colors.Reds.Red);
    //    Add color 2 to the color wheel --#11.1
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    //    Add color 3 to the color wheel --#12.1
    ColorWheel.addColor(Colors.Yellows.Gold);
    //    Add color 4 to the color wheel --#13.1
    ColorWheel.addColor(Colors.Yellows.Yellow);
    //    Add color 4 to the color wheel --#14
    ColorWheel.addColor(Colors.Yellows.Yellow);
    //    Add color 3 to the color wheel --#15
    ColorWheel.addColor(Colors.Yellows.Gold);
    //    Add color 2 to the color wheel --#16
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    //    Add color 1 to the color wheel --#17
    ColorWheel.addColor(Colors.Reds.Red);
    //    ------------- Recipe for drawOctogon --#10
    //    Do the following 8 times --#6
    for (int i = 1; i <= 8; i++);
    {
      //      Change the color of the line the tortoise draws to the next color on the color wheel --#4
      Tortoise.setPenColor(Colors.getRandomColor());
      //      Move the tortoise 50 pixels --#2
      Tortoise.move(50);
      //      Turn the tortoise 1/8th of 360 degrees to the right --#5
      Tortoise.turn(360 / 8);
      //    Repeat  
    }
  }
}
