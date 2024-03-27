package Unit6.Lesson29_1;


/**
* Write a description of class Pig here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Pig implements Animal
{   
private String mySound;
private String myType;
public Pig(String type,String sound) {
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
