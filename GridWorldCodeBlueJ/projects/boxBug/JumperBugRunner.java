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
import java.awt.Color;
import info.gridworld.grid.UnboundedGrid;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class JumperBugRunner
{
    public static void main(String[] args)
    {
        int[] moveList = {2,6,8,3,6,7,3};
        ActorWorld world = new ActorWorld(new UnboundedGrid());
        JumperBug alice = new JumperBug(0,0);
        Rock rock = new Rock();
        Flower flower = new Flower();
        alice.setDirection(90);
        alice.setColor(Color.ORANGE);
        world.add(new Location(0,2), rock);
        world.add(new Location(4,4),flower);
        world.add(new Location(0,0), alice);
        world.show();
    }
}
