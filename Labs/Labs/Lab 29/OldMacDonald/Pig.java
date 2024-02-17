
/**
 * Description: Gives the sounds and the names of the animals
 * Purpose: To learn how to use inheritance, Polymorphism, and Abstract Classes
 * Author: Kevin Dunkel
 * Version: 2/15/24
 * Lab: 29.2
 */
class Pig implements Animal
{
  private String myType;
  private String mySound;

  Pig(String type, String sound)
  {
    myType = type;
    mySound = sound;
  }

  public String getSound() { return mySound; }
  public String getType() { return myType; }
}
