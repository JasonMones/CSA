/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import java.awt.Point;

/**
 * A <code>JumperBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class JumperBug extends Bug
{
    Location currentLocation;
    int[] rowOffset = {-2,-2,-2, 0,0, 2,2,2};
    int[] colOffset = {-2, 0, 2,-2,2,-2,0,2};
    private final Point NORTHWEST = new Point(rowOffset[0], colOffset[0]);
    private final Point NORTH = new Point(rowOffset[1], colOffset[1]);
    private final Point NORTHEAST = new Point(rowOffset[2], colOffset[2]);
    private final Point WEST = new Point(rowOffset[3], colOffset[3]);
    private final Point EAST = new Point(rowOffset[4], colOffset[4]);
    private final Point SOUTHWEST = new Point(rowOffset[5], colOffset[5]);
    private final Point SOUTH = new Point(rowOffset[6], colOffset[6]);
    private final Point SOUTHEAST = new Point(rowOffset[7], colOffset[7]);
    
    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public JumperBug(int startRow, int startCol)
    {
        currentLocation = new Location(startRow, startCol);        
    }
    /**
     * Moves to the next location of the square.
     */
    public void act()
    { 
        if (canMove()) {
            Grid<Actor> gr = getGrid();
            Point directionComponents = degreesToVector(getDirection()); 
            currentLocation = new Location(
                                           currentLocation.getRow()+directionComponents.x,
                                           currentLocation.getCol()+directionComponents.y);
            removeSelfFromGrid();
            putSelfInGrid(gr, currentLocation);
        }
        else {
            turn();
        }
    }
    @Override
    public boolean canMove() {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
           return false;
        }
        Location loc = getLocation();
        Location next = getAdjacentLocation(getDirection());
        if (!gr.isValid(next)) { 
           return false;
        }
        Actor neighbor = gr.get(next);
        if (neighbor instanceof Rock || neighbor instanceof JumperBug) {
            return false;
        }
        return (neighbor == null) || (neighbor instanceof Actor);
    }
    protected Location getAdjacentLocation(int direction) {
        Point directionComponents = degreesToVector(direction);
        return new Location(
                            currentLocation.getRow() + directionComponents.x,
                            currentLocation.getCol() + directionComponents.y);
    }
    private Point degreesToVector(int direction) {
        if(direction == 0) return NORTH;
        if(direction == 45) return NORTHEAST;
        if(direction == 90) return EAST;
        if(direction == 135) return SOUTHEAST;
        if(direction == 180) return SOUTH;
        if(direction == 225) return SOUTHWEST;
        if(direction == 270) return WEST;
        if(direction == 315) return NORTHWEST;
        return new Point(0,0);
    }
}
