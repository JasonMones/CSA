
/**
 * Author:      Mason Jones
 * Date:        01/19/2024
 * Lab:         21.1 Life
 * Description: A program that simulates life using a 20x20 grid with each asterisk representing
 *              an organism. If an empty cell has 3 living organisms adjacent to it, an 
 *              organism is "born". If a living cell has only one or no neighbors at all,
 *              it "dies" from loneliness, but also dies to overcrowding with 4 or more 
 *              adjacent cells filled. This program goes up to 5 generations
 * Purpose:     Learn how to traverse through a two dimensional array, using it to simulate
 *              a grid that can store information
 */

import chn.util.*;
import apcslib.*;
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
                myGrid[row-1][column-1] = true;
            }
        }
        else {
            System.out.println("Invalid input array");
        }
        input.close();
    }
    public void nextGenState() {
        boolean[][] tempArray = new boolean[20][20];
        for (int i = 0; i<20;i++) {
            for (int j = 0; j<20;j++) {
                singleCellState(i,j,tempArray);
            }
        }
        myGrid = tempArray;
    }
    public void printGrid() {
        System.out.print(Format.left("",5));
        for (int i = 1; i <= 20; i++) {
            System.out.print(i%10 + " ");
        }
        System.out.println();
        for (int i = 0; i<20; i++) {
            System.out.print(Format.right(i+1,2) + Format.left("",3));
            for (int j = 0; j<20; j++) {
                if (myGrid[i][j]) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    public int liveRowNum(int row) {
        int counter = 0;
        for (int i = 0; i < 20; i++) {
            if (myGrid[row][i] == true) {
                counter++;
            }
        }
        return counter;
    }
    public int liveColNum(int column) {
        int counter = 0;
        for (boolean[] row : myGrid) {
            if (row[column] == true) {
                counter++;
            }
        }
        return counter;
    }
    public int liveTotalNum() {
        int counter = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (myGrid[i][j]) {
                    counter++;
                }
            }
        }
        return counter;
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
    private void singleCellState(int row, int column, boolean[][] nextGen) {
        int neighbors = checkAliveNeighbors(row, column);
        if (!myGrid[row][column] && neighbors == 3) {
            nextGen[row][column] = true;
        }
        else if (myGrid[row][column] && (neighbors == 1 || neighbors == 0)) {
            nextGen[row][column] = false;
        }
        else if (myGrid[row][column] && neighbors > 3) {
            nextGen[row][column] = false;
        }
        else {
            nextGen[row][column] = myGrid[row][column];
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
