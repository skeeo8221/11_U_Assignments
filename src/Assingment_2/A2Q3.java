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
        Robot sunsar = new Robot(Sunsartown, 3, 0, Direction.NORTH);

        sunsar.setLabel("s");
        //create walls


        sunsar.getAvenue();

        while (true)
               if (sunsar.getAvenue() > 0) {

            sunsar.move();

        } else {

                    sunsar.turnLeft();
                   
            
               if (sunsar.getStreet() > 0) {
                   
                  
                   sunsar.move();
                   
               }else{
                   
                   
                   
               }
        }
    }
}
