package Unit7.Lesson27;


/**
 * Write a description of class storeRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class storeRunner
{
    public static void main(String[] args) {
        Store s = new Store("C:\\Users\\mason\\Documents\\Java\\CSA\\Labs\\Labs\\Unit7\\Lesson27\\file50.txt");
        
        s.doSort();
        s.displayStore();
    }
}
