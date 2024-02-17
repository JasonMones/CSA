
/**
 * Write a description of class QuickCrab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter
{

    @Override
    public ArrayList<Location> getLocationsInDirections(int[] directions)
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        for (int d : directions)
        {
            Location quickLoc = loc.getAdjacentLocation(getDirection() + d)
                .getAdjacentLocation(getDirection() + d);
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            if (gr.isValid(neighborLoc) && !(gr.get(neighborLoc) instanceof Critter) && !(gr.get(neighborLoc) instanceof Rock)) {
                if (gr.isValid(quickLoc) && !(gr.get(quickLoc) instanceof Critter) && !(gr.get(quickLoc) instanceof Rock)) {
                    locs.add(quickLoc);
                }
                else {
                        locs.add(neighborLoc);
                }
            }
        }
        return locs;
    }    
}
