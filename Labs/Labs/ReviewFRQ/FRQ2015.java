package ReviewFRQ;


/**
 * Write a description of class FRQ2015 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
public class FRQ2015
{
    class DiverseArray {
        public static int arraySum(int[] numArray) {
            int sum = 0;
            for (int element : numArray) {
                sum += element;
            }
            return sum;
        }
        public static int[] rowSums(int[][] matrix) {
            int[] rowSums = new int[matrix.length];
            int rowSum = 0;
            int ind = 0;
            for (int[] row : matrix) {
                for (int element : row) {
                    rowSum += element;
                }
                rowSums[ind] = rowSum;
                rowSum = 0;
                ind++;
            }
            return rowSums;
        }
        public static boolean isDiverse(int[][] matrix) {
            int[] rowSums = rowSums(matrix);
            for (int i = 0; i < rowSums.length; i++) {
                for (int j = i + 1; j < rowSums.length; j++) {
                    if (rowSums[i] == rowSums[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
    class hiddenWord {
        char[] hiddenWordLetters;
        public hiddenWord(String hiddenWord) {
            hiddenWordLetters = new char[hiddenWord.length()];
            hiddenWordLetters = getCharArray(hiddenWord);
        }
        public String getHint(String guess) {
            String hint = "";
            char[] guessLetters = getCharArray(guess);
            for (int i = 0; i < guess.length(); i++) {
                if (hiddenWordLetters[i] == (guessLetters[i])) {
                   hint += hiddenWordLetters[i];
                   continue;
                }
                for (int j = 0; j < guess.length(); j++) {
                    if (j != i && guessLetters[j] == hiddenWordLetters[i]) {
                        hint += "+";
                    }
                    else {
                        hint += "*";
                    }
                }
            }
            return hint;
        }
        private static char[] getCharArray(String str) {
            char[] charArray = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                charArray[i] = str.charAt(i);
            }
            return charArray;
        }
    }
    class SparseArrayEntry {
        private int row, col, value;
        public SparseArrayEntry(int r, int c, int v) {
            row = r;
            col = c;
            value = v;
        }
        public int getRow() {
            return row;
        }
        public int getCol() {
            return col;
        }
        public int getValue() {
            return value;
        }
    }
    class SparseArray {
        private List<SparseArrayEntry> entries = new ArrayList<SparseArrayEntry>();
        private int cols = 0;
        public int getValueAt(int row, int col) {
            for (SparseArrayEntry entry : entries) {
                if (entry.getRow() == row && entry.getCol() == col) {
                    return entry.getValue();
                }
            }
            return 0;
        }
        public int numCols() {
            return cols;
        }
        public void removeColumn(int col) {
            int tempValue, tempRow, tempCol;
            for (SparseArrayEntry entry : entries) {
                if (entry.getCol() == col) {
                    entries.remove(entry);
                }
                else if (entry.getCol() > col) {
                    tempValue = entry.getValue();
                    tempRow = entry.getRow();
                    tempCol = entry.getCol();
                    entries.remove(entry);
                    entries.add(new SparseArrayEntry(tempRow, tempCol - 1, tempValue));
                }
            }
        }
    }
    interface NumberGroup {
        public boolean contains(int number);
    }
    class Range implements NumberGroup {
        int min, max;
        public Range(int min, int max) {
            this.min = min;
            this.max = max;
        }
        public boolean contains(int number) {
            if (number >= min && number <= max) {
                return true;
            }
            return false;
        }
    }
    class MultipleGroups implements NumberGroup {
        private List<NumberGroup> groupList;
        public MultipleGroups(List<NumberGroup> groups) {
            groupList = groups;
        }
        public boolean contains(int number) {
            for (NumberGroup group : groupList) {
                if (group.contains(number)) {
                    return true;
                }
            }
            return false;
        }
    }
}
