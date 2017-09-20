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
public class A1Q4 {

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
        Robot sunsar = new Robot(Sunsartown, 0, 0, Direction.SOUTH);

        //create robot
        Robot owen = new Robot(Sunsartown, 0, 1, Direction.SOUTH);

        //create walls
        new Wall(Sunsartown, 0, 1, Direction.WEST);
        new Wall(Sunsartown, 1, 1, Direction.WEST);
        new Wall(Sunsartown, 1, 1, Direction.SOUTH);


        //set sunsars color to black
        sunsar.setColor(Color.black);

        //set sunsars color to black
        owen.setColor(Color.black);


        //get sunsar to move
        sunsar.move();
        //get owen to move
        owen.move();
        //get sunsar to move
        sunsar.move();
        //get sunsar to turn left
        owen.turnLeft();
        //get owen to move
        owen.move();
        //get sunsar to turn left
        sunsar.turnLeft();
        //get sunsar to move
        sunsar.move();
        //get owen to turn left
        owen.turnLeft();
        owen.turnLeft();
        owen.turnLeft();
        //get owen to move
        owen.move();
        //get owen to turn left
        owen.turnLeft();
        owen.turnLeft();
        owen.turnLeft();
        //get owen to move
        owen.move();
    }
}
