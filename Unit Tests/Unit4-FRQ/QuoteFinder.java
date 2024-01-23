

public class QuoteFinder
{
   private String inputString;
   private String textInQuote;
   public QuoteFinder() {
       inputString = "";
       textInQuote = "";
   }
   public QuoteFinder(String str) {
       inputString = str;
       textInQuote = "";
   }
   public void setInput(String str) {
       inputString = str;
   }
   public String getQuote() {
       return textInQuote;
   }
   public void setQuote() {
       int startIndex = 0; int endIndex = 0; 
       boolean firstQuote = false; boolean secondQuote = false;
       for (int i = 0; i < inputString.length(); i++) {
           if (inputString.charAt(i) == '"' && firstQuote) {
               endIndex = i;
               secondQuote = true;
           }
           else if (inputString.charAt(i) == '"') {
               startIndex = i + 1;
               firstQuote = true;
           }
           if (secondQuote) {
               break;
           }
       }
       if (!(firstQuote && secondQuote)) {
           textInQuote = "";
       }
       else {
          textInQuote = inputString.substring(startIndex, endIndex);
       }
   }
}
