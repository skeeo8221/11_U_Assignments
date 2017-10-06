/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author skeeo8221
 */
public class A3Q2 {

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
        Robot sunsar = new Robot(Sunsartown, 1, 1, Direction.EAST);


        //create 10 things
        Thing a = new Thing(Sunsartown, 1, 1);
        Thing b = new Thing(Sunsartown, 1, 1);
        Thing c = new Thing(Sunsartown, 1, 1);
        Thing d = new Thing(Sunsartown, 1, 1);
        Thing e = new Thing(Sunsartown, 1, 1);
        Thing f = new Thing(Sunsartown, 1, 1);
        Thing g = new Thing(Sunsartown, 1, 1);
        Thing h = new Thing(Sunsartown, 1, 1);
        Thing i = new Thing(Sunsartown, 1, 1);
        Thing j = new Thing(Sunsartown, 1, 1);



        //give robot the label "s"
        sunsar.setLabel("s");



        //new variable that counts things moved
        int thingCount = 0;


        //while loop if less than 10 things have been moved
        while (true) {

            while (thingCount < 10) {


                //make sunsar pick up a thing than move it oce forward, then go back and pick another thing and move it until all 10 things are moved

                sunsar.pickThing();

                sunsar.move();

                sunsar.putThing();

                sunsar.turnLeft();
                sunsar.turnLeft();

                sunsar.move();

                sunsar.turnLeft();
                sunsar.turnLeft();

                thingCount = thingCount + 1;


            }

            //go to new pile
            sunsar.move();
            break;


        }

    }
}
