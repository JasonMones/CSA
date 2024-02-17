package Unit5.Lesson21;


import chn.util.*;
import apcslib.*;

public class KnightsTour2 extends KnightsTour
{
   private final int[] rowOffsets = {-2, -2, -1, -1, 1, 1, 2, 2};
   private final int[] colOffsets = {-1, 1, -2, 2, -2, 2, -1, 1};
   private int[][] chessBoard;
   private int moveNumber, rowPosition, columnPosition;
   private final String PATH = "/home/mason/development/Java/Labs/knightsTour/access.txt";
   private int[][] referenceBoard = new int[9][9];
   
   public KnightsTour2(int startRow, int startColumn) {
       rowPosition = startRow;
       columnPosition = startColumn;
       chessBoard = super.chessBoard;
       int moveNumber = super.moveNumber;
   }
   @Override
   public void createBoard(){
        for (int i = 0; i < 9; i++) {
           for (int j = 0; j < 9; j++) {
               chessBoard[i][j] = 0;  
           }
           chessBoard[i][0] = i;
        }   
        for (int i = 0; i <chessBoard[0].length; i++) {
            chessBoard[0][i] = i;
        }
        moveNumber++;
        chessBoard[rowPosition][columnPosition] = moveNumber;
        referenceBoard[rowPosition][columnPosition] = 99;
        moveNumber++;
        chessBoard[0][0] = 99;
    }
    @Override
    public int getMoveNumber() {
        return moveNumber;
    }
   public void loadReferenceBoard() {
       FileInput inFile = new FileInput(PATH);
       for (int i = 1; i < 9; i++) {
           for (int j = 1; j < 9; j++) {
               referenceBoard[i][j] = inFile.readInt();
           }
       }
       inFile.close();
       for (int[] row : referenceBoard) {
           row[0] = 99;
       }
       for (int i = 0; i < 9; i++) {
           referenceBoard[0][i] = 99;
       }
   }
   public void printReferenceBoard() {
       for (int i = 0; i < 9; i++) {
             for (int j = 0; j < 9; j++) {
                System.out.print(Format.right(referenceBoard[i][j],5));
                if (j == 0) {
                    System.out.print("  ");
                }
             }
             if (i == 0) {
                 System.out.println();
             }
             System.out.println();
       }
   }
   @Override
   public void moveKnight() {
       int[] leastAccessible = getLowestAccessibility();
       rowPosition = leastAccessible[0];
       columnPosition = leastAccessible[1];
       
       chessBoard[rowPosition][columnPosition] = moveNumber;
       referenceBoard[rowPosition][columnPosition] = 99;
       decreaseAccessibility();
       moveNumber++;
       System.out.println(rowPosition+ " row pos move knight " + columnPosition);
   }
   private void decreaseAccessibility() {
        int newRow,newCol;
        for (int i = 0; i < 8; i++) {
            newRow = rowPosition + rowOffsets[i];
            newCol = columnPosition + colOffsets[i];

            if (super.isValidPosition(newRow, newCol) && referenceBoard[newRow][newCol] !=99) {
                referenceBoard[newRow][newCol]--;
            }
        }
   }
   private int[] getLowestAccessibility() {
       int newRow,newCol;
       int lowestAccessibility = 99;
       int[] leastAccessible = new int[2];
       for (int i = 0; i < 8; i++) {
           newRow = rowPosition + rowOffsets[i];
           newCol = columnPosition + colOffsets[i];
           
           if (super.isValidPosition(newRow, newCol) && referenceBoard[newRow][newCol] !=99) {
               if (lowestAccessibility == 0 && referenceBoard[newRow][newCol] == 0) {
                    referenceBoard[newRow][newCol] = 99;
               } 
               if (referenceBoard[newRow][newCol] < lowestAccessibility) {
                    lowestAccessibility = referenceBoard[newRow][newCol];
                    leastAccessible[0] = newRow;
                    leastAccessible[1] = newCol;
                }
                System.out.println(referenceBoard[newRow][newCol]+" ref board"
                +lowestAccessibility + " low access " + newRow + " " + newCol);
            }
       }
       return leastAccessible;
   }
}
