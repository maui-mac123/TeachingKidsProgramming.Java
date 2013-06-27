package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellThree
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shell = MessageBox.askForNumericalInput("length of shell");
    //    If the size of a shell is less than 350
    if (shell < 350)
    {
      MessageBox.askForTextInput("size of the shell is too small");
      MessageBox.askForNumericalInput("please give update of size of shell");
    }
    //    Otherwise, Do the following the "shell size" number of times
    Tortoise.setPenColor(Colors.getRandomColor());
    //          Set the value of the large length to the size of the shell divided by 150
    //          Subtract the value of the large length from the current length
    //      If the value of the large length is less than zero
    {
    }
    //      Set the value of the length to the length plus 5
    //         Otherwise, Call the drawTriangle method (recipe below)      
    //          Set the value of the number of rotations to 7
    //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell 
    drawTriangle();
  }
  private static void drawTriangle()
  {
    for (int i = 1; i <= 2.75; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}