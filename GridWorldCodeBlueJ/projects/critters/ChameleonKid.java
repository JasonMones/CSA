
/**
 * Write a description of class ChameleonKid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
public class ChameleonKid extends ChameleonCritter
{
    @Override
    public ArrayList<Actor> getActors() {
        Grid<Actor> grid = getGrid();
        ArrayList<Actor> array = new ArrayList<Actor>();
        Actor a = null;
        Location loc = getLocation().getAdjacentLocation(getDirection());
        if (grid.isValid(loc)) {
            a = grid.get(loc);
        }
        if (a != null) array.add(a);
        loc = getLocation().getAdjacentLocation(getDirection()-180);
        if (grid.isValid(loc)) {
            a = grid.get(loc);
        }
        if (a!= null) array.add(a);
        return array;
    }
}
