package Daily;

/**
 * Write a description of class GuessingGameMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.ConsoleIO;
public class GuessingGameMethods
{
    private int smallestNumber, biggestNumber;
    public GuessingGameMethods() {
        smallestNumber = 0;
        biggestNumber = 1024;
    }

    public int split() {
        return (biggestNumber+smallestNumber)/2; 
    } 

    public int randomGuess() {
        return (int) ((Math.random()*1023) +1);
    }

    public boolean checkCorrectness(String guessCondition, int guess) {
        if (guessCondition.equals("c")) {
            return true;
        }
        else if (guessCondition.equals("h")) {
            biggestNumber = guess;
        }
        else {
            smallestNumber = guess;
        }
        return false;
    }
}
