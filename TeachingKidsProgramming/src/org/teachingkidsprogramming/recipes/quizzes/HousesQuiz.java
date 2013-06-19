package org.teachingkidsprogramming.recipes.quizzes;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuiz
{
  public void question1()
  {
    //  The current length is 7]
    length = 7;
  }
  //
  //      Question2
  //      Create a method called medium
  //       that sets the current length to 21
  public void medium()
  {
    length = 21;
  }
  //
  //      Question3
  //      Create a method called large
  //       that sets the current length to 63
  public void large()
  {
    length = 63;
  }
  //
  //      Question4
  //      Create a method called moveTheLength
  //       that moves the Tortoise the current length
  public void moveTheLength()
  {
    Tortoise.move(length);
  }
  //
  //      Question5
  //      Create a method called turnTheCorner
  //       that turns the Tortoise 1/3 of 360 degrees to the left
  public void turnTheCorner()
  {
    Tortoise.turn(-360 / 3);
  }
  //
  //      Question6
  //      Create a method called drawASide
  //       that calls moveTheLength and turnTheCorner 
  public void drawASide()
  {
    moveTheLength();
    turnTheCorner();
  }
  //
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
