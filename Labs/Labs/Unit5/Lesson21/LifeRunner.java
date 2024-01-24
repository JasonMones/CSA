
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

public class LifeRunner
{
    public static void main(String[] args) {
        final String PATH = "/home/mason/development/Java/Labs/21.1 Life/life100.txt";
        boolean[][] grid = new boolean[20][20];
        LifeRunnerMethods lrm = new LifeRunnerMethods(PATH, grid);
        lrm.loadFile();
        for (int i = 1; i<=5;i++) {
            lrm.nextGenState();
        }
        lrm.printGrid();
        System.out.println("Number in Row 10 ---> " + lrm.liveRowNum(9));
        System.out.println("Number in Column 10 ---> " + lrm.liveColNum(9));
        System.out.println("Number of living organisms ---> " + lrm.liveTotalNum());
    }
}
