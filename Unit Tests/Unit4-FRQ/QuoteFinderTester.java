
import chn.util.*;
public class QuoteFinderTester
{
   public static void main(String[] args) {
       String inputString;
       ConsoleIO kb = new ConsoleIO();
       
       System.out.println("Welcome to the Text Quotation Program.\n");
       while (true) {
           System.out.print("Enter a sentence that may contain double quotes: ");
           inputString = kb.readLine();
           if (inputString.equals("q") || inputString.equals("Q")) {
               break;
           }
           QuoteFinder qf = new QuoteFinder(inputString);
           qf.setQuote();
           if (qf.getQuote().equals("")) {
               System.out.println("No pair of double quotes found.\n");
           }
           else {
               System.out.println("The first quoted text is: " + qf.getQuote() + "\n");
           }
        }
   }
}
