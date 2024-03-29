package Unit7.Lesson28;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        final String PATH = "C:\\Users\\mason\\Documents\\Java\\CSA\\Labs\\Labs\\Unit7\\Lesson28\\textExcerpt.txt";
        WordCountMethods wcm = new WordCountMethods(PATH);
        wcm.printWords();
    }
}
