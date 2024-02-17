
/**
 * Description: Gives the sounds and the names of the animals
 * Purpose: To learn how to use inheritance, Polymorphism, and Abstract Classes
 * Author: Kevin Dunkel
 * Version: 2/15/24
 * Lab: 29.2
 */
public class NamedCow extends Cow
{
    private String myName;

    NamedCow(String type, String name, String sound)
    {
        super(type, sound);
        myName = name;
    }

    public String getName() {return myName;}
}

