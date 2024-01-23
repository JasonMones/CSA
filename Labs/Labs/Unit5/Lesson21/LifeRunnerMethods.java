package Unit5.Lesson21;


import chn.util.*;

public class LifeRunnerMethods
{
    private String myPATH;
    private boolean[][] myGrid;
    
    public LifeRunnerMethods(String PATH, boolean[][] grid) {
        myPATH = PATH;
        myGrid = grid;
    }
    public void loadFile() {
        FileInput input = new FileInput(myPATH);
        int row, column;
        
        if (checkGrid()) {
            while (input.hasMoreLines()) {
                row = input.readInt();
                column = input.readInt();
                myGrid[row][column] = true;
            }
        }
        else {
            System.out.println("Invalid input array");
        }
        input.close();
    }
    private int checkAliveNeighbors(int row, int column) {
        int neighbors = 0;
        if (row > 0 && column > 0 && myGrid[row-1][column-1]) {
            neighbors++;
        }
        if (row > 0 && myGrid[row-1][column]) {
            neighbors++;
        }
        if (row > 0 && column < 19 && myGrid[row-1][column+1]) {
            neighbors++;
        }
        if (column > 0 && myGrid[row][column-1]) {
            neighbors++;
        }
        if (column < 19 && myGrid[row][column+1]) {
            neighbors++;
        }
        if (row < 19 && column > 0 && myGrid[row+1][column-1]) {
            neighbors++;
        }
        if (row < 19 && myGrid[row+1][column]) {
            neighbors++;
        }
        if (row < 19 && column < 19 && myGrid[row+1][column+1]) {
            neighbors++;
        }
        return neighbors;
    }
    private void nextGenState(int row, int column) {
        int neighbors = checkAliveNeighbors(row, column);
        if (!myGrid[row][column] && neighbors == 3) {
            myGrid[row][column] = true;
        }
    }
    private void printGrid() {
        for (int i = 0; i<20; i++) {
            for (int j = 0; j<20; j++) {
                System.out.print(myGrid[i][j] + " ");
            }
            System.out.println();
        }
    }
    private boolean checkGrid() {
        if (myGrid.length !=20) {
            return false;
        }
        for (int i = 0; i<20; i++) {
            if (myGrid[i].length != 20) {
                return false;
            }
        }
        return true;
    }
}
