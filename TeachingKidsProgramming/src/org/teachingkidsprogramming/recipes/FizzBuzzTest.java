package org.teachingkidsprogramming.recipes;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest
{
  @Test
  public void test1Produces1()
  {
    //Confirm When we give one to fizz buzz we get one
    Assert.assertEquals("1", FizzBuzz.convert(1));
  }
  @Test
  public void test2Produces2()
  {
    //Confirm When we give two to fizz buzz we get two
    Assert.assertEquals("2", FizzBuzz.convert(2));
  }
  @Test
  public void test3ProducesFizz()
  {
    //Confirm When we give two to fizz buzz we get two
    Assert.assertEquals("Fizz", FizzBuzz.convert(3));
  }
  @Test
  public void test4Produces4()
  {
    //Confirm When we give 4 to fizz buzz we get 4
    Assert.assertEquals("4", FizzBuzz.convert(4));
  }
  @Test
  public void testmultiplesof3ProducesFizz()
  {
    //Confirm When we give 6 to fizz buzz we get fizz
    Assert.assertEquals("Fizz", FizzBuzz.convert(6));
  }
  @Test
  public void test5buzz()
  {
    //Confirm When we give 5 to fizz buzz we get 5
    Assert.assertEquals("Bizz", FizzBuzz.convert(5));
  }
  @Test
  public void test10buzz()
  {
    //Confirm When we give 5 to fizz buzz we get 5
    Assert.assertEquals("Buzz", FizzBuzz.convert(10));
  }
  @Test
  public void test10buzz()
  {
    //Confirm When we give 15 to fizz buzz we get 15
    Assert.assertEquals("FizzBuzz", FizzBuzz.convert(60));
  }
}
