package Unit7;

/**
 * Write a description of class Ee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Ee
{
    private static ArrayList<String> animals = new ArrayList<String>();
    public static void manipulate() {
        animals.add("bear");
        animals.add("zebra");
        animals.add("bass");
        animals.add("cat");
        animals.add("koala");
        animals.add("baboon");
        for (int k = animals.size() -1;k>0;k--) {
            if (animals.get(k).substring(0,1).equals("b")) {
                animals.add(animals.size()-k, animals.remove(k));
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }
}
