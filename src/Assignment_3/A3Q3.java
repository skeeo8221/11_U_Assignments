/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author skeeo8221
 */
public class A3Q3 {

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
        Robot sunsar = new Robot(Sunsartown, 1, 1, Direction.EAST, 20);





        //give robot the label "s"
        sunsar.setLabel("s");



//new integers to count things dropped and rows made
        int thingRowCount = 0;
        int thingCount = 0;

        sunsar.getDirection();

//if less than for rows and 5 thins have been placed make a row
        while (true) {

            while (thingRowCount < 4) {



                while (thingCount < 5) {

                    sunsar.putThing();

                    sunsar.move();

                    thingCount = thingCount + 1;


                }


//turn around to set up next row
                if (sunsar.getDirection() == Direction.EAST) {

                    sunsar.turnLeft();
                    sunsar.turnLeft();
                    sunsar.turnLeft();

                    sunsar.move();

                    sunsar.turnLeft();
                    sunsar.turnLeft();
                    sunsar.turnLeft();

                    sunsar.move();



//turn around to set up next row
                } else {


                    sunsar.turnLeft();


                    sunsar.move();

                    sunsar.turnLeft();

                    sunsar.move();

                }

                thingRowCount = thingRowCount + 1;
                thingCount = thingCount - 5;

            }


        }

    }
}
