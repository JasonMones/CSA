package Unit7.Lesson28;

/**
 * Write a description of class Word here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.Format;

public class Word
{
    
    int myFreq;
    String myWord;
    
    public Word(String word, int freq)
    {
        this.myFreq = freq;
        this.myWord = word;
    }
    public int compareTo(Word otherWord) {
        int otherFreq = otherWord.getFreq();
        if (otherFreq < myFreq) {
            return 1;
        } else if (otherFreq == myFreq) {
            return 0;
        }
        else {
            return -1;
        }
    }
    public int getFreq() {
        return myFreq;
    }
    public String getWord() {
        return myWord;
    }
    public String toString() {
        return Format.right(myFreq,7) + Format.left("",5) + myWord;
    }
}
