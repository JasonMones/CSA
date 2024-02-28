
/**
 * Write a description of class KingCrab here.
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

public class KingCrab extends CrabCritter
{
    @Override
    public void processActors(ArrayList<Actor> actors) {
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        Location next;
        int direction;
        for (Actor a : actors) {
            if (!(a instanceof Rock) && !(a instanceof Critter)) {
                a.removeSelfFromGrid();
                continue;
            }
            direction = loc.getDirectionToward(a.getLocation());
            next = a.getLocation().getAdjacentLocation(direction);
            if (gr.isValid(next)) {
                a.moveTo(next);
            }
            else a.removeSelfFromGrid();
        }
    }
}
