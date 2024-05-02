package ReviewFRQ;



/**
 * Write a description of class FRQ2016 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
public class FRQ2016
{
    class RandomStringChooser {
        private ArrayList<String> words;
        public RandomStringChooser(String[] input) {
            words = new ArrayList();
            for (int i = 0; i < input.length; i++) {
                words.add(input[i]);
            }
        }
        
        private RandomStringChooser() {
        }
        
        public String getNext() {
            if (words.size() == 0) {
                return "NONE";
            }
            int ind = (int) (Math.random() * (words.size()+1))-1;
            String value = words.get(ind);
            words.remove(ind);
            return value;
        }
    }
    class RandomLetterChooser extends RandomStringChooser {
        private String[] charArr;
        public RandomLetterChooser(String str) {
            charArr = getSingleLetters(str);
        }

        public static String[] getSingleLetters(String str) {
            return new String[] {"",""};
        }
    }
    class LogMessage
    {
        private String machineId;
        private String description;
        /** Precondition: message is a valid log message. */
        public LogMessage(String message) {
            machineId = message.substring(0,message.indexOf(":"));
            description =  message.substring(message.indexOf(":")+1);
        }

        /** Returns true if the description in this log message properly contains keyword;
         * false otherwise.
         */
        public boolean containsWord(String keyword) {
            int ind = description.indexOf(keyword);
            if (ind == -1) {
                return false;
            }
            else if (!(ind == 0 && description.charAt(ind-1) == (char) 32)) {
                return false;
            }
            else if (!(ind == description.length() - keyword.length() - 1 && description.charAt(ind + keyword.length() +1) == (char) 32)) {
                return false;
            }
            return true;
        }

        public String getMachineId()
        { return machineId; }

        public String getDescription()
        { return description; }
        // There may be instance variables, constructors, and methods that are not shown.
    }
    public class SystemLog
    {
        /** Contains all the entries in this system log.
         * Guaranteed not to be null and to contain only non-null entries.
         */
        private List<LogMessage> messageList;
        /** Removes from the system log all entries whose descriptions properly contain keyword,
         * and returns a list (possibly empty) containing the removed entries.
         * Postcondition:
         * - Entries in the returned list properly contain keyword and
         * are in the order in which they appeared in the system log.
         * - The remaining entries in the system log do not properly contain keyword and
         * are in their original order.
         * - The returned list is empty if no messages properly contain keyword.
         */
        public List<LogMessage> removeMessages(String keyword) {
            for (int i = 0; i < messageList.size(); i++) {
                if (!messageList.get(i).containsWord(keyword)) {
                    messageList.remove(i);
                }
            }
            return messageList;
        }
        // There may be instance variables, constructors, and methods that are not shown.
    }
    class Square
    {
        /** Constructs one square of a crossword puzzle grid.
         * Postcondition:
         * - The square is black if and only if isBlack is true.
         * - The square has number num.
         */
        public Square(boolean isBlack, int num)
        { /* implementation not shown */ }
        // There may be instance variables, constructors, and methods that are not shown.
    }
    class Crossword
    {
        /** Each element is a Square object with a color (black or white) and a number.
         * puzzle[r][c] represents the square in row r, column c.
         * There is at least one row in the puzzle.
         */
        private Square[][] puzzle;
        /** Constructs a crossword puzzle grid.
         * Precondition: There is at least one row in blackSquares.
         * Postcondition:
         * - The crossword puzzle grid has the same dimensions as blackSquares.
         * - The Square object at row r, column c in the crossword puzzle grid is black
         * if and only if blackSquares[r][c] is true.
         * - The squares in the puzzle are labeled according to the crossword labeling rule.
         */
        public Crossword(boolean[][] blackSquares) {
            int c = blackSquares.length;
            int r = blackSquares[0].length;
            int num = 1;
            puzzle = new Square[c][r];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    if (blackSquares[r][c] == true) {
                        puzzle[r][c] = new Square(true, 0);
                    }
                    else if (toBeLabeled(r,c,blackSquares) == true) {
                        puzzle[r][c] = new Square(false, num);
                        num++;
                    }
                    else {
                        puzzle[r][c] = new Square(false, 0);
                    }
                }
            }
        }
            /** Returns true if the square at row r, column c should be labeled with a positive number;
             * false otherwise.
             * The square at row r, column c is black if and only if blackSquares[r][c] is true.
             * Precondition: r and c are valid indexes in blackSquares.
             */
            private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
            if (r == 0 || c == 0) {
                return true;
            }
            if (blackSquares[r-1][c] == true || blackSquares[r][c-1] == true) {
                return true;
            }
            return false;
        }
        // There may be instance variables, constructors, and methods that are not shown.
    }
    class StringFormatter {
        public static int totalLetters(List<String> wordList) {
            int letters = 0;
            for (String str : wordList) {
                letters += str.length();
            }
            return letters;
        }
        public static int basicGapWidth(List<String> wordList, int formattedLen) {
            return (formattedLen - totalLetters(wordList))/(wordList.size());
        }
        public static String format(List<String> wordList, int formattedLen) {
            int basicGapWidth = basicGapWidth(wordList, formattedLen);
            int leftoverSpaces = leftoverSpaces(wordList, formattedLen);
            String formattedString = "";
            for (int i = 0; i < wordList.size(); i++) {
                formattedString += wordList.get(i);
                for (int j = 0; j <= basicGapWidth; j++) {
                    formattedString += " ";
                }
                if (leftoverSpaces > 0) {
                    formattedString += " ";
                    leftoverSpaces--;
                }
            }
            return formattedString;
        }
        private static int leftoverSpaces(List<String> wordList, int length) {
            return 0;
        }
    }
}
