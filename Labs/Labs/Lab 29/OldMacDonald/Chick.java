
/**
 * Description: Gives the sounds and the names of the animals
 * Purpose: To learn how to use inheritance, Polymorphism, and Abstract Classes
 * Author: Kevin Dunkel
 * Version: 2/15/24
 * Lab: 29.2
 */

    class Chick implements Animal
{
  private String myType;
  private String mySound;
  private String AltSound;
  Chick(String type, String sound, String AltSound)
  {
    myType = type;
    mySound = sound;
    AltSound = sound;
  }

  public String getSound() { return mySound;}
  public String getType() { return myType; }
}

