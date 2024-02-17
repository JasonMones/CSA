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

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import java.awt.Color;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.BoundedGrid;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class MultiplierBugRunner
{
    public static void main(String[] args)
    {
        int[] moveList = {2,6,8,3,6,7,3};
        ActorWorld world = new ActorWorld(new BoundedGrid(40,40));
        MultiplierBug mpb1 = new MultiplierBug(0,0, 5);
        MultiplierBug mpb2 = new MultiplierBug(0,0, 5);
        Bug minion1 = new Bug();
        Bug minion2 = new Bug();
        Bug minion3 = new Bug();
        Bug minion4 = new Bug();
        mpb1.setDirection(90);
        mpb2.setDirection(90);
        mpb1.setColor(Color.ORANGE);
        mpb2.setColor(Color.BLUE);
        
        world.add(new Location(0,0), mpb1);
        world.add(new Location(0,39), mpb2);
        world.add(new Location(20,20), minion1);
        world.add(new Location(20,30), minion2);
        world.add(new Location(10,0), minion3);
        world.add(new Location(0,20), minion4);
        world.show();
    }
}
