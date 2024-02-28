package Unit6.Lesson29_1;


/**
 * Write a description of class Cow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cow implements Animal
{   
    protected String mySound;
    protected String myType;
    public Cow(String type, String sound) {
        mySound = sound;
        myType = type;
    }
    public String getSound() {
        return mySound;
    }
    public String getType() {
        return myType;
    }
}
