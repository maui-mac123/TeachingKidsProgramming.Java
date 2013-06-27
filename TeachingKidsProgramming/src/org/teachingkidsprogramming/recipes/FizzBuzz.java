package org.teachingkidsprogramming.recipes;

public class FizzBuzz
{
  public static String convert(int i)
  {
    //If the number is multiple of 3 give fizz
    if (i % 3 == 0)
    {
      return "Fizz";
    }
    else if (i == 5)
    {
      return "Bizz";
    }
    else if (i % 2 == 0 && i % 5 == 0)
    {
      return "Buzz";
    }
    //15
    else if (i % 3 == 0 && i % 5 == 0)
    {
      return "FizzBuzz";
    }
    else
    {
      return i + "";
    }
  }
}
