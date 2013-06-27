package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    //      Make the tortoise move as fast as possible --#4
    Tortoise.setSpeed(10);
    //      createColorPalette (recipe below) --#6
    //      ------------- Recipe for createColorPalette --#6
    //createColorPalette();
    ColorWheel.getRandomColorFromWheel();
    drawOctagonWithOverlap();
    createColorwheel();
    //      ------------- End of createColorPalette recipe --#6
    //      Do the following 30 times --#10
    for (int i = 1; i <= 30; i++)
    {
      //              Change the color of the line the tortoise draws to a random color from the color wheel --#5
      ColorWheel.getRandomColorFromWheel();
      Tortoise.turn(360 / 30);
      Tortoise.turn(5);
    }
  }
  private static void createColorwheel()
  {
    ColorWheel.addColor(Colors.Pinks.HotPink);
    ColorWheel.addColor(Colors.Reds.Red);
    ColorWheel.addColor(Colors.Pinks.Fuchsia);
    ColorWheel.addColor(Colors.Reds.OrangeRed);
    ColorWheel.addColor(Colors.Pinks.DeepPink);
    ColorWheel.addColor(Colors.Reds.MediumVioletRed);
    ColorWheel.addColor(Colors.Reds.Crimson);
    ColorWheel.addColor(Colors.Reds.Tomato);
  }
  private static void drawOctagonWithOverlap()
  {
    for (int j = 1; j <= 8 + 1; j++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
}
