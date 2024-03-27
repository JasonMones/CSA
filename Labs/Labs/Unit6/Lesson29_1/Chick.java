package Unit6.Lesson29_1;


/**
* Write a description of class Chick here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Chick implements Animal
{   
private String mySound;
private String myType;
private String myAltSound;
public Chick(String type, String sound) {
mySound = sound;
myType = type;
}
public Chick(String type, String sound, String altSound) {
myType = type;
mySound = sound;
myAltSound = altSound;
}
public String getSound() {
int soundPick = (int) (Math.round(Math.random()));
if (soundPick == 1) {
return myAltSound;
}
return mySound;
}
public String getType() {
return myType;
}
}
