/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingment_2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

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
        Robot sunsar = new Robot(Sunsartown, 8, 3, Direction.EAST);



        //set robots label to "s"
        sunsar.setLabel("s");

        //retrive current adress and direction
        sunsar.getStreet();
        sunsar.getAvenue();
        sunsar.getDirection();

        //make while loop proceed if direction is not north
        while (sunsar.getDirection() != Direction.NORTH) {

            //get sunsar to turn left
            sunsar.turnLeft();

        }

        //make while loop proceed if steet number is greater than zero
        while (sunsar.getStreet() > 0) {

            //get sunsar to move
            sunsar.move();

            //if statement if robot is curently at avenue zero 
            if (sunsar.getAvenue() == 0) {

                //get sunsar to turn left
                sunsar.turnLeft();

            }
        }

        //get sunsar to turn left
        sunsar.turnLeft();


        //while statement while robot is curently an avenue greater than zero 
        while (sunsar.getAvenue() > 0) {


            //get sunsar to move
            sunsar.move();




        }
    }
}