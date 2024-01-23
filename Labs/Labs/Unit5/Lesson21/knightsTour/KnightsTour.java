import java.util.Arrays;
import java.util.List;
import java.util.Random;
import apcslib.*;

public class KnightsTour
{
    protected int rowPosition;
    protected int columnPosition;
    private final List<Integer> possibleMoveComponentsX = Arrays.asList(-2,-1,1,2);
    private final List<Integer> possibleMoveComponentsY1 = Arrays.asList(-2, 2);
    private final List<Integer> possibleMoveComponentsY2 = Arrays.asList(-1,1);
    protected int[][] chessBoard;
    protected int moveNumber;
    
    private Random rand = new Random();
    public KnightsTour(int startRow, int startColumn) {
        rowPosition = startRow;
        columnPosition = startColumn;
        chessBoard = new int[9][9];
        moveNumber = 1;
    }
    public KnightsTour() {
        chessBoard = new int[9][9];
        moveNumber = 1;
    }
    public int getMoveNumber() {
        return moveNumber;
    }
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
        chessBoard[rowPosition][columnPosition] = moveNumber;
        moveNumber++;
    }
    public void printBoard() {
         for (int i = 0; i < 9; i++) {
             for (int j = 0; j < 9; j++) {
                System.out.print(Format.right(chessBoard[i][j],5));
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
    private int[] randomMovement(){
        int xComponent = possibleMoveComponentsX.get(rand.nextInt(possibleMoveComponentsX.size()));      //gives a value of either -2,-1,1, or 2
        int yComponent;
        if (xComponent == -1 || xComponent == 1) {
            yComponent = possibleMoveComponentsY1.get(rand.nextInt(possibleMoveComponentsY1.size()));        //gives a value of either -2 or 2
        }
        else {   
            yComponent = possibleMoveComponentsY2.get(rand.nextInt(possibleMoveComponentsY2.size()));        //gives a value of either -1 or 1
        }
        int[] components = {xComponent, yComponent};
        return components;
    }
    private boolean checkIfPossible(int[] components) {
        if (rowPosition + components[0] < 1||rowPosition + components[0] > 8) {
            return false;
        } else if (columnPosition + components[1] < 1 || columnPosition + components[1] > 8) {
            return false;
        } else if (chessBoard[rowPosition + components[0]][columnPosition + components[1]] != 0) {
            return false;
        } 
        return true;  
    }
    public void moveKnight() {
            boolean notPossible = true;
            while (notPossible) {
                int[] movement = this.randomMovement();
                if (this.checkIfPossible(movement)) {
                    notPossible = false;
                    rowPosition += movement[0];
                    columnPosition += movement[1];
                    chessBoard[rowPosition][columnPosition] = moveNumber;
                    moveNumber++;
                } 
            }
    }
    public boolean canMoveKnight() {
        int[] rowOffsets = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] colOffsets = {-1, 1, -2, 2, -2, 2, -1, 1};
        for (int i = 0; i < 8; i++) {
            int newRow = rowPosition + rowOffsets[i];
            int newCol = columnPosition + colOffsets[i];

            if (isValidPosition(newRow, newCol) && chessBoard[newRow][newCol] == 0) {
                return true;
            }
            else {
                if (isValidPosition(newRow, newCol)) {
                    System.out.println(chessBoard[newRow][newCol]);
                    System.out.println(newRow+" new row");
                    System.out.println(newCol+" new col");
                    System.out.println(rowPosition+" row pos");
                    System.out.println(columnPosition+" col pos");
                    System.out.println(i + " i");
                }
            }
        }
        return false;
    }
    protected boolean isValidPosition(int row, int col) {
        return row >= 1 && row < 9 && col >= 1 && col < 9;
    }
}



