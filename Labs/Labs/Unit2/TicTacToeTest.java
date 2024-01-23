package Unit2;

 


import chn.util.*;
public class TicTacToeTest
{
    static TicTacToe ttt = new TicTacToe();
    static ConsoleIO kb = new ConsoleIO();
    public static void main(String[] args) {
        ttt.createBoard();
        int[] coordinates = new int[2];
        int xCell;
        int yCell;
        int filledCells;
        boolean run;
        boolean notValidCell;
        boolean inputInvalid;
        boolean gameFinished;
        
        filledCells = 0;
        run = true;
        while (run) {
            System.out.println("Input cell to draw X");
            coordinates = getInput();
            xCell = coordinates[0];
            yCell = coordinates[1];
            
            notValidCell = true;
            gameFinished = false;
             while (notValidCell) {
                if (ttt.checkCell(xCell, yCell)) {
                    notValidCell = false;
                    ttt.drawX(xCell, yCell);
                    filledCells++;
                    if (ttt.checkForThree()) {
                        run = false;
                        System.out.println("X won!");
                        gameFinished = true;
                        break;
                    }
                } 
                else {
                    System.out.println("Input cell to draw X");
                    coordinates = getInput();
                    xCell = coordinates[0];
                    yCell = coordinates[1];
                }
            }
            if (gameFinished) {
                break;
            }
            if (checkDraw(filledCells)) {
                break;
            }
            System.out.println("Input cell to draw O");
            coordinates = getInput();
            xCell = coordinates[0];
            yCell = coordinates[1];
            
            notValidCell = true;
            while (notValidCell) {
                if (ttt.checkCell(xCell, yCell)) {
                    notValidCell = false;
                    ttt.drawO(xCell, yCell);
                    filledCells++;
                    if (checkDraw(filledCells)) {
                        break;
                    }
                    if (ttt.checkForThree()) {
                        run = false;
                        System.out.println("O won!");
                        break;
                    }
                }
                else {
                    System.out.println("Input cell to draw O");
                    coordinates = getInput();
                    xCell = coordinates[0];
                    yCell = coordinates[1];
                }
            }
        }
    }
    private static int[] getInput() {
        int[] coordinates = new int[2];
        boolean invalidInput = true;
        int xCoordinate;
        int yCoordinate;
        
        do {
            xCoordinate = kb.readInt();
            yCoordinate = kb.readInt();
            if (notValidInput(xCoordinate, yCoordinate)) {
                System.out.println("Invalid input");
            }
            else {
                invalidInput = false;
            }
        }
            while (invalidInput);
        coordinates[0] = xCoordinate;
        coordinates[1] = yCoordinate;
        return coordinates;
    }
    private static boolean notValidInput(int xCoord, int yCoord) {
        if (xCoord < 1 || xCoord > 3) {
            return true;
        }
        if (yCoord < 1 || yCoord > 3) {
            return true;
        }
        return false;
    }
    private static boolean checkDraw(int filledCells) {
        if (filledCells>8) {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }
}
