package org.teachingkidsprogramming.recipes.homework;

import junit.framework.Assert;

import org.junit.Test;

public class Homework02
{
  //  'How to do homework:
  //  'Step 1: Press the Run Button
  //            PC: Ctrl+F11 
  //            Mac: Command+fn+F11
  //  'Step 2: Read the name of the Method (Sub) that Failed
  //  'Step 3: Fill in the blank (___) to make it pass
  //  'Step 4: Repeat Until Enlightenment
  //  ' Do not change anything except the blank (___)
  //
  @Test
  public void youCanReadVariables() throws Exception
  {
    int numberOfDesserts = 5;
    Assert.assertEquals(numberOfDesserts, 5);
  }
  @Test
  public void youCanSaveVariables() throws Exception
  {
    int ickynessOfBrothers = 2 * 5;
    Assert.assertEquals(10, ickynessOfBrothers);
  }
  @Test
  public void youCanDoMathWithVariables() throws Exception
  {
    int numberOfHarryPotterBooks = 3 + 4;
    String[][] books = {{"Harry Potter and the Philosopher's Stone", "(June 26, 1997)"},
        {"Harry Potter and the Chamber of Secrets", "(July 2, 1998)"},
        {"Harry Potter and the Prisoner of Azkaban", "(July 8, 1999)"},
        {"Harry Potter and the Goblet of Fire", "(July 8, 2000)"},
        {"Harry Potter and the Order of the Phoenix", "(June 21, 2003)"},
        {"Harry Potter and the Half-Blood Prince", "(July 16, 2005)"},
        {"Harry Potter and the Deathly Hallows", "(Scheduled for July 21, 2007)"}};
    for (String[] book : books)
    {
      for (String test : book)
        System.out.print(test + " ");
      System.out.println();
    }
    Assert.assertEquals(books.length, numberOfHarryPotterBooks);
  }
  @Test
  public void youCanChangeVariables() throws Exception
  {
    int milkTastiness = 6;
    addChocolate();
    milkTastiness = 10;
    Assert.assertEquals(milkTastiness, 2 * 5);
  }
  @Test
  public void variablesAreSnotStuck() throws Exception
  {
    int boogers = 4;
    blowNose();
    boogers = 0;
    Assert.assertEquals(0, boogers);
  }
  @Test
  public void youCanAddToAVariable() throws Exception
  {
    int age = 11;
    celebrateBirthday();
    age += 6 - 5;
    Assert.assertEquals(12, age);
  }
  @Test
  public void youCanAddInMultipleWays() throws Exception
  {
    int bakersDozen = 12;
    bakersDozen = bakersDozen + 1;
    Assert.assertEquals("IaBakersDozen".length(), bakersDozen);
  }
  @Test
  public void youCanAddOneInOneMoreWay() throws Exception
  {
    int bearsInABed = 3;
    andTheLittleOneSaid("I'm lonely, come back here");
    bearsInABed++;
    Assert.assertEquals(bearsInABed, Integer.parseInt("4"));
  }
  @Test
  public void youCanSubtractFromAVariable() throws Exception
  {
    int amountOfHomework = 3;
    amountOfHomework -= 3;
    Assert.assertEquals(0, amountOfHomework);
  }
  @Test
  public void youCanSubtractOneInOneMoreWay() throws Exception
  {
    int bottlesOfBeerOnTheWall = 99;
    bottlesOfBeerOnTheWall--;
    Assert.assertEquals(bottlesOfBeerOnTheWall, 98);
  }
  @Test
  public void youCanMultiplyVariables() throws Exception
  {
    int volumeOfMyVoice = 2;
    int volumeMyMomHears = volumeOfMyVoice * 5;
    Assert.assertEquals(2 * 5, volumeMyMomHears);
  }
  @Test
  public void youCanDivideVariables() throws Exception
  {
    int inches = 36;
    int feet = inches / 12;
    Assert.assertEquals(3, feet);
  }
  @Test
  public void variablesOnlyExistWithinTheMethod() throws Exception
  {
    String xmasList = "bike";
    dreamBigger(); //This method is directly below
    Assert.assertEquals(xmasList, "bike");
  }
  private void dreamBigger()
  {
    String xmasList = "hippopotamus";
  }
  @Test
  public void methodsCanReturnValues() throws Exception
  {
    String bedPost = prepareForBed(); //This method is directly below
    Assert
        .assertEquals(bedPost, ("there is some " + "g" + "u" + "m" + " under the bed").split("there is some ")[1]
            .split(" under the bed")[0]);
  }
  public String prepareForBed()
  {
    return "gum";
  }
  /**
   * Ignore the following, It's needed to run the homework
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */
  public String ___  = "You need to fill in the blank ___";
  public int    ____ = 10000;
  public String ___()
  {
    return ___;
  }
  private void addChocolate()
  {
  }
  private void celebrateBirthday()
  {
  }
  private void blowNose()
  {
  }
  private void andTheLittleOneSaid(String string)
  {
  }
}
