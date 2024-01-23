

package Unit4.Lesson13;

import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Piglatinator
{
   //substring method
   private String myString;
   private char firstChar;
   private String firstSegment;
   private String secondSegment;
   private String singleToken;
   private String translatedToken;
   private String returnString;
   public Piglatinator(String string) {
       myString = string;
       returnString = "";
       firstChar = 'a';
       firstSegment = "";
       secondSegment = "";
       singleToken = "";
       translatedToken = "";
   }
   public String singleToken(String str) {
       firstChar = str.charAt(0);
       if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u' || 
          firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U') {
              return str += "yay";                                              //if the first letter is a vowel
       }
       for (int i = 0; i < str.length();i++) {
           if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || 
           str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
               firstSegment = str.substring(0,i);                               //segment of string before the first vowel
               secondSegment = str.substring(i,str.length()-i + 1);             //segment of string including the first vowel and after
               return secondSegment + firstSegment + "ay";                      //returns the flipped string plus ay
           }
       }
       return str+"ay";                                                         //if the word contains no vowels
   }
   public String translate() {
       int startIndex = 0;                                                      //first index of a token
       int stopIndex = 0;                                                       //last index of a token
       for (int i = 0; i<myString.length();i++) {
           if (myString.charAt(i) <= 'z' && myString.charAt(i) >= 'A') {        //only alphanumeric
              for (int j = i; j < myString.length() && (myString.charAt(j) <= 'z' && myString.charAt(j)>= 'A');j++) {  //if the string has fully iterated or hit a non-alphanumeric
                  startIndex = i;                                               //sets where the token starts at
                  stopIndex = j + 1;                                            //sets where the token ends
              }
              translatedToken = singleToken(myString.substring(startIndex, stopIndex));  //calls single token method to translate a single token
              returnString += translatedToken + " ";                                     //adds the string to the string of all the translated tokens
              i = stopIndex;                                                             //sets the main loop to start iterating again at the end of the last token
           }
       }
       return returnString;
   }
}
