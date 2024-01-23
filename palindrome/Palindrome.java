
import java.util.Scanner;


public class Palindrome
{

    public static boolean isPalindrome(String string)
    {
        
            if (string.length()%2 == 1) {
                for (int i=0; i<=(string.length()-1)/2;i++) {
                    System.out.println(string.length()+1-i);
                    if (string.charAt(i) == string.charAt(string.length() -1-i)) {
                    } else {
                        return false;
                    }
            }
        }
           else if (string.length()%2==0) {
               for (int i=0; i<=string.length()/2;i++) {
                    if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                    } else {
                        return false;
                    }
            }
        } return true;
    }    
    
    public static void main() {
    Scanner input = new Scanner(System.in);
    String inString = input.nextLine();
    boolean True = isPalindrome(inString);
    if (True) {
        System.out.println("The palindrome of " + inString + " is " + inString);
    } else {
        System.out.println(inString+" is not a palindrome");
    }
}

}

