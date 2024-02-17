
/**
 * Write a description of class RockHound here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class RockHound extends Critter
{
    @Override
    public void processActors(ArrayList<Actor> actors) {
        for (Actor a : actors) {
            if (!(a instanceof Critter)) {
                a.removeSelfFromGrid();
            }
        }
    }
    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
