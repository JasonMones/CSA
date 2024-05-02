package ReviewFRQ;

/**
 * Write a description of class FRQ2014 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;
public class FRQ2014
{
    public static String scrambleWord(String word) {
        String scrambledString = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != (char) 65) {
                scrambledString += word.charAt(i);
            }
            else if (word.charAt(i) == (char) 65 && word.charAt(i+1) != (char) 65) {
                scrambledString += word.charAt(i+1);
                scrambledString += "A";
                i++;
            }
            else {
                scrambledString += "AA";
                i++;
            }
        }
        return scrambledString;
    }

    public static void scrambleOrRemove(List<String> wordList) {
        for (String str : wordList) {
            if (str.equals(scrambleWord(str))) {
                wordList.remove(str);
                continue;
            }
            wordList.set(wordList.indexOf(str), scrambleWord(str));
        }
    }
    class Director extends Rock {
        public Director() {
            setColor(Color.RED);
        }
        
        public void act() {
            if (getColor() == Color.RED) {
                setColor(Color.GREEN);
            }
            else {
                setColor(Color.RED);
            }
        }
        
        public void processActors(ArrayList<Actor> actors) {
            for (Actor actor : actors){
                if (getColor() == Color.GREEN) {
                    actor.setDirection(getDirection() + Location.RIGHT);
                }
            }
        }
    }
    public class Student {
        public String getName() {
            return "";
        }
        public int getNme mame()
    }
}
