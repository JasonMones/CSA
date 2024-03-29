package Unit7.Lesson27;


/**
 * Write a description of class storeRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.ConsoleIO;
public class storeRunner
{
    public static void main(String[] args) {
        Store s = new Store("C:\\Users\\mason\\Documents\\Java\\CSA\\Labs\\Labs\\Unit7\\Lesson27\\file50.txt");
	System.out.println("Database before sorted: ");
	System.out.println();
	s.displayStore();
	s.doSort();
	System.out.println();
	System.out.println("Database after sorted by id: ");
	System.out.println();
	s.displayStore();
	System.out.println();
	
	s.testSearch();
    }
    
}
