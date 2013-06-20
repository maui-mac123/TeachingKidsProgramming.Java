package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    //    Do the following 8 times --#9
    //     Ask the user for a guess --#1
    //     Otherwise, if the guess is too low --#8
    //     Tell the end user that it is too low --#7
    //    If after 8 times they haven't guessed correctly then --#12
    //     Tell them they've lost the game --#11
    int _rand = (int) (Math.random() * 100 + 1);
    for (int _guesses = 1; _guesses <= 8; _guesses++)
    {
      int _response = MessageBox.askForNumericalInput("GUESS!!!");
      //     If the guess is correct --#4
      if (_response == _rand)
      {
        //     Play a bell --#2
        //     Tell the user that they won the game  --#3
        MessageBox.showMessage("You freaking won.\nNow listen to your failures.");
        _guesses++;
        while (_guesses >= 0)
        {
          Sounds.playBeep();
          _guesses--;
        }
        System.exit(0);
        //     and exit --#10
        //        break;
      }
      //     Otherwise, if the guess is too high --#6
      else
      {
        //     Tell the end user that it is too high --#5
        if (_response > _rand)
        {
          MessageBox.showMessage("Too High Brosef");
        }
        if (_response < _rand)
        {
          MessageBox.showMessage("Too low");
        }
      }
    }
  }
}
