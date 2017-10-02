/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author skeeo8221
 */
public class A2Q4 {

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
        Robot sunsar = new Robot(Sunsartown, 0, 0, Direction.EAST);
        //create walls
        new Wall(Sunsartown, 1, 1, Direction.NORTH);
        new Wall(Sunsartown, 1, 1, Direction.EAST);
        new Wall(Sunsartown, 1, 1, Direction.SOUTH);
        new Wall(Sunsartown, 1, 1, Direction.WEST);
        new Wall(Sunsartown, 4, 1, Direction.NORTH);
        new Wall(Sunsartown, 4, 1, Direction.EAST);
        new Wall(Sunsartown, 4, 1, Direction.SOUTH);
        new Wall(Sunsartown, 4, 1, Direction.WEST);
        new Wall(Sunsartown, 4, 4, Direction.NORTH);
        new Wall(Sunsartown, 4, 4, Direction.EAST);
        new Wall(Sunsartown, 4, 4, Direction.SOUTH);
        new Wall(Sunsartown, 4, 4, Direction.WEST);
        new Wall(Sunsartown, 1, 4, Direction.NORTH);
        new Wall(Sunsartown, 1, 4, Direction.EAST);
        new Wall(Sunsartown, 1, 4, Direction.SOUTH);
        new Wall(Sunsartown, 1, 4, Direction.WEST);
        new Wall(Sunsartown, 2, 3, Direction.EAST);
        new Wall(Sunsartown, 3, 3, Direction.EAST);
        new Wall(Sunsartown, 2, 2, Direction.WEST);
        new Wall(Sunsartown, 3, 2, Direction.WEST);
        new Wall(Sunsartown, 2, 3, Direction.NORTH);
        new Wall(Sunsartown, 2, 2, Direction.NORTH);
        new Wall(Sunsartown, 3, 3, Direction.SOUTH);
        new Wall(Sunsartown, 3, 2, Direction.SOUTH);

        //give robot the label "s"
        sunsar.setLabel("s");


        //while loop 
        while (true) {

            //make sunsar move
            sunsar.move();
            sunsar.move();

            //make sunsar turn right
            sunsar.turnLeft();
            sunsar.turnLeft();
            sunsar.turnLeft();

            //make sunsar move
            sunsar.move();

            //make sunsar turn left
            sunsar.turnLeft();

            //make sunsar move
            sunsar.move();

            //make sunsar turn left
            sunsar.turnLeft();

            //amke sunsar move
            sunsar.move();

            //make sunsar turn right
            sunsar.turnLeft();
            sunsar.turnLeft();
            sunsar.turnLeft();

            //make sunsar move
            sunsar.move();
            sunsar.move();

            //make sunsar turn right
            sunsar.turnLeft();
            sunsar.turnLeft();
            sunsar.turnLeft();

        }

    }
}
