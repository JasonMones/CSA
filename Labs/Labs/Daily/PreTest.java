package Daily;

import chn.util.*;
public class PreTest
{
    public static void main(String[] args)
    {
      ConsoleIO kb = new ConsoleIO();
      System.out.println("Enter any word: ");
      String word = kb.readToken();
      int firstChar = (int) word.charAt(0);
      System.out.println("The first character of the word " + word + " has an ASCII value of " + firstChar);
    }
}
