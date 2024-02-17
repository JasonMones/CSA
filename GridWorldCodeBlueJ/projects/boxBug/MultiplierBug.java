
/**
 * Write a description of class MultiplierBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower;

public class MultiplierBug extends Bug
{
    private final Location init;
    private final int s, numOfSides;
    private int steps, sides;
    public MultiplierBug(int startRow, int startCol, int length) {
        init = new Location(startRow, startCol);
        s = length;
        steps = 0;
        sides = 0;
        numOfSides = 6;
    }

    public void act() {
        if (canMove()) {
            Grid<Actor> gr = getGrid();
            Location loc = getLocation();
            if (gr.get(loc.getAdjacentLocation(getDirection())) instanceof Bug) {
                Bug minion = new Bug(getColor());
                minion.putSelfInGrid(gr, init);
            }
            if (steps < s) {
                move();
                steps++;
            }
            else {
                turn();
            }
        }
        else {
            turn();
            steps = 0;
            sides++;
            if (sides == numOfSides) {
                sides = 0;
                turn();
                turn();
            }
        }
    }

    public boolean canMove()
    {   Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower) || (neighbor instanceof Bug);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }
}

