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
public class A2Q3 {

 
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

        while (!(sunsar.canPickThing())) {
            if (sunsar.frontIsClear()) {


            } else {
                //get sunsar to jump over herdle
                sunsar.turnLeft();
                //get sunsar to  move
                sunsar.move();
                //get sunsar to turn right
                sunsar.turnLeft();
                sunsar.turnLeft();
                sunsar.turnLeft();
                //get sunsar to  move
                sunsar.move();
                //get sunsar to turn right
                sunsar.turnLeft();
                sunsar.turnLeft();
                sunsar.turnLeft();
                //get sunsar to  move
                sunsar.move();
                //get sunsar to turn left
                sunsar.turnLeft();
            }
        }

        sunsar.pickThing();
        
    }
}
