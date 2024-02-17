
/**
 * Write a description of class BlusterCritter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.ArrayList;
public class BlusterCritter extends Critter
{
    private int c;
    public BlusterCritter(int courage) {
        c = courage;
    }
    public ArrayList<Actor> getActors() {
        Grid<Actor> gr = getGrid();
        Location next;
        ArrayList<Actor> actors = new ArrayList<Actor>();
        for (int i = -2; i < 2; i++) {
            for (int j = -2; j < 2; j++) {
                next = new Location(getLocation().getRow()+i,getLocation().getCol()+j);
                if (next.equals(getLocation())) {
                    continue;
                }
                else if (gr.isValid(next) && gr.get(next) != null) {
                    actors.add(gr.get(next));
                }
            }
        }
        return actors;
    }
    public void processActors(ArrayList<Actor> actors) {
        if (actors.size() >= c) {
            setColor(getColor().darker());
        }
        else {
            setColor(getColor().brighter());
        }
    }
    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
