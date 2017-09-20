/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author skeeo8221
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



        /**
         * @param args the command line arguments
         */
        //create a new city called sunsartown
        City Sunsartown = new City();

        //create robot
        Robot sunsar = new Robot(Sunsartown, 0, 1, Direction.WEST);

        //create robot
        Robot owen = new Robot(Sunsartown, 3, 3, Direction.EAST);

        sunsar.setLabel("s");
        owen.setLabel("o");
        
        
        
        //create thing
        Thing a = new Thing(Sunsartown, 0, 0);
        Thing b = new Thing(Sunsartown, 1, 0);
        Thing c = new Thing(Sunsartown, 1, 1);
        Thing d = new Thing(Sunsartown, 1, 2);
        Thing e = new Thing(Sunsartown, 2, 2);

        //create walls
        new Wall(Sunsartown, 2, 3, Direction.WEST);
        new Wall(Sunsartown, 2, 3, Direction.NORTH);
        new Wall(Sunsartown, 2, 3, Direction.EAST);
        new Wall(Sunsartown, 3, 3, Direction.EAST);
        new Wall(Sunsartown, 3, 3, Direction.SOUTH);

        //get sunsar to move
        sunsar.move();
        //get owen to turn left
        owen.turnLeft();
        owen.turnLeft();
        //get owen to move
        owen.move();
        //get sunsar to pick up thing
        sunsar.pickThing();
        //get sunsar to turn left
        sunsar.turnLeft();
        //get sunsar to move
        sunsar.move();
        //get sunsar to pick thing
        sunsar.pickThing();
        //get owen to turn left
        owen.turnLeft();
        owen.turnLeft();
        owen.turnLeft();
        //get owen to move
        owen.move();
       //get owen to pick up thing
        owen.pickThing();
        //get sunsar to turn left
        sunsar.turnLeft();
        //get sunsar to move
        sunsar.move();
        //get sunsar to pick thing
        sunsar.pickThing();
        //get owen to move
        owen.move();
        //get owen to pick up thing
        owen.pickThing();
        //get owen to turn left
        owen.turnLeft();
        
        
    }
}
