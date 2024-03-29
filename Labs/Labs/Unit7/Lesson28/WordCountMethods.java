package Unit7.Lesson28;

/**
 * Write a description of class WordCountMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import chn.util.FileInput;
import java.util.Collections;
import apcslib.Format;
public class WordCountMethods
{
    Word[] words;
    int totalWords;
    int uniqueWords;
    public WordCountMethods(String path) {
        totalWords = 0;
        uniqueWords = 0;
        words = toWord(parse(new FileInput(path)));
        wordQuickSort(words, 0, uniqueWords-1);
    }

    public void printWords() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Format.right(i+1,2) + words[i].toString());
            if ((i+1)%5 == 0) {
                System.out.println();
            }
        }
        System.out.println("Number of words used = " + uniqueWords);
        System.out.println("Total # of words = " + totalWords);
    }

    private Word[] toWord(ArrayList<String> list) {
        Collections.sort(list);
        ArrayList<Word> words = new ArrayList<Word>();
        Word[] wordsArray;
        String current = "";
        String next = "";
        int freq = 1;
        for (int i = 0; i < list.size(); i++) {
            next = list.get(i);
            if (next.equals(current)) {
                freq++;
            } else {
                words.add(new Word(current, freq));
                current = next;
                freq = 1;
            }
        }
        uniqueWords = words.size();
        wordsArray = new Word[uniqueWords];
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = words.get(i);
        }
        return wordsArray;
    }

    private ArrayList<String> parse(FileInput input) {
        ArrayList<String> list = new ArrayList<String>();
        String token;
        int ascii;
        while(input.hasMoreTokens()) {
            token = input.readToken().toLowerCase().replaceAll("\\p{Punct}", "");
            if (token.length() == 1) {
                ascii = (int) (token.charAt(0));
                if (!((ascii >= 30 && ascii <= 57) || (ascii>=97 && ascii<=122))) {
                    continue;
                }
            }
            list.add(token);
        }
        totalWords = list.size();
        return list;
    }

    private void wordQuickSort(Word[] list, int first, int last){
        int g = first, h = last;
        int midIndex = (first + last) / 2;
        Word dividingValue = list[midIndex];
        do
        {
            while (list[g].compareTo(dividingValue) == 1) {
                g++;
            }
            while (list[h].compareTo(dividingValue) == -1) {
                h--;
            }
            if (g <= h)
            {
                //swap(list[g], list[h]);
                Word temp = list[g];
                list[g] = list[h];
                list[h] = temp;
                g++;
                h--;
            }
        }
        while (g < h);
        if (h > first) {
            wordQuickSort (list,first,h);
        }
        if (g < last) {
            wordQuickSort (list,g,last);
        }
    } 
}
