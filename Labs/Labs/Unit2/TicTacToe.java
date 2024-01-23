package Unit2;

 

import java.util.Map;
import java.util.HashMap;
import apcslib.*;
import java.awt.geom.Point2D.Double;

public class TicTacToe
{
    int xCell;
    int yCell;
    
    private int[][] referenceBoard  = new int[4][4]; //make private in future
    
    private static Map<Integer, Integer> coordinateConvert;
    static {
        coordinateConvert = new HashMap<>();
        coordinateConvert.put(1, -150);
        coordinateConvert.put(2, -50);
        coordinateConvert.put(3,  50);
    }
    private Rectangle rect = new Rectangle();
    private DrawingTool tttp = new DrawingTool(rect.rectangleScreen);

    public TicTacToe()
    {
        xCell = 0;
        yCell = 0;
    }
    private void fillReferenceBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                referenceBoard[i][j] = j;
            }
        }
    }
    public void createBoard()
    {
        Rectangle square = new Rectangle(-200,-200,300,300);                 //instantiate a rectangle with left corner at (-200,-200), width of 300, height of 300
        Rectangle row = new Rectangle(-200,-100,300,100);                    //instantiate a rectangle with left corner at (-200,-100), width of 300, height of 100
        Rectangle column = new Rectangle(-100,-200,100,300);                 //instantiate a rectangle with left corner at (-100,-200), width of 100, height of 300
      
        square.setDirection(90);
        row.setDirection(90);
        column.setDirection(90);
                        
        square.draw();                                                       //draw the first rectangle
        row.draw();                                                          //draw the second rectangle
        column.draw();                                                       //draw the third rectangle
        fillReferenceBoard();
    }
    public boolean checkCell(int x, int y) {
        if (referenceBoard[x][y] == 'X' || referenceBoard[x][y] == 'O') {
            System.out.println("Cell is already filled, try again");
            return false;                                        //fix so that errors do not occur in main while loop
        } else return true;
    }
    public void drawX(int x, int y) {
        referenceBoard[x][y] = 'X';
        this.goToCell(x,y);
        tttp.up();
        tttp.setDirection(180);
        tttp.move(50);
        tttp.turnLeft(90);
        tttp.move(50);
        tttp.down();
        tttp.setDirection(45);
        tttp.move(141);
        tttp.up();
        tttp.setDirection(180);
        tttp.move(100);
        tttp.down();
        tttp.setDirection(315);
        tttp.move(141);
        this.goToCell(x,y);
        }
    public void drawO(int x, int y) {
        referenceBoard[x][y] = 'O';
        this.goToCell(x,y);
        tttp.drawCircle(45);
    }
    private void goToCell(int x, int y) {
        tttp.up();
        tttp.move(coordinateConvert.get(x), coordinateConvert.get(y));
        tttp.down();

    }
    public boolean checkForThree() {
        //check for row
        for (int[] row : referenceBoard) {
            if (row[1] == row[2] && row[1] == row[3]) {
                Double position = tttp.getPosition();
                return true;
            }
        }
        //check for column
        int[] column = new int[4]; 
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                column[j] = referenceBoard[j][i];
            }
            if (column[1] == column[2] && column[1] == column[3]) {
                return true;
            }
        }
        //check for diagonal
        if (referenceBoard[1][1] == referenceBoard[2][2] && referenceBoard[1][1] == referenceBoard[3][3]) {
            return true;
        }
        else if (referenceBoard[3][1] == referenceBoard[2][2] && referenceBoard[3][1] == referenceBoard[1][3]) {
            return true;
        } 
        return false;
    }
}
