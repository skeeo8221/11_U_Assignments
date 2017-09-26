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
public class A2Q1 {

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

        sunsar.setLabel("s");
  
        
        //create thing
        
        Thing b = new Thing(Sunsartown, 1, 2);
        Thing c = new Thing(Sunsartown, 1, 3);
        Thing d = new Thing(Sunsartown, 1, 4);
        Thing e = new Thing(Sunsartown, 1, 5);
        Thing f = new Thing(Sunsartown, 1, 6);
        Thing g = new Thing(Sunsartown, 1, 7);
        Thing h = new Thing(Sunsartown, 1, 8);
        Thing i = new Thing(Sunsartown, 1, 9);
        Thing j = new Thing(Sunsartown, 1, 10);
        Thing a = new Thing(Sunsartown, 1, 11);
        
        
        while (true){
            while (sunsar.countThingsInBackpack()!= 7){
            
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
