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
public class A2Q2 {

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
        Robot sunsar = new Robot(Sunsartown, 3, 0, Direction.EAST);

        sunsar.setLabel("s");
        //create walls

        new Wall(Sunsartown, 3, 0, Direction.SOUTH);
        new Wall(Sunsartown, 3, 1, Direction.SOUTH);
        new Wall(Sunsartown, 3, 2, Direction.SOUTH);
        new Wall(Sunsartown, 3, 3, Direction.SOUTH);
        new Wall(Sunsartown, 3, 4, Direction.SOUTH);
        new Wall(Sunsartown, 3, 5, Direction.SOUTH);
        new Wall(Sunsartown, 3, 6, Direction.SOUTH);
        new Wall(Sunsartown, 3, 7, Direction.SOUTH);
        new Wall(Sunsartown, 3, 8, Direction.SOUTH);
        new Wall(Sunsartown, 3, 0, Direction.EAST);
        new Wall(Sunsartown, 3, 1, Direction.EAST);
        new Wall(Sunsartown, 3, 3, Direction.EAST);
        new Wall(Sunsartown, 3, 6, Direction.EAST);

        //create thing
        Thing a = new Thing(Sunsartown, 3, 8);


        while (true) {
            while (sunsar.countThingsInBackpack() != 7) {

                //get sunsar to  move
                sunsar.move();
                //get sunsar to pick up thing
                sunsar.pickThing();
            }

            //get sunsar to  move
            sunsar.move();
            sunsar.move();
            sunsar.move();
            sunsar.move();

            break;
        }

    }
}
