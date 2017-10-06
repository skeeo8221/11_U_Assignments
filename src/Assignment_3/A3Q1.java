/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author skeeo8221
 */
public class A3Q1 {

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
        Robot sunsar = new Robot(Sunsartown, 0, 2, Direction.WEST);


        //create walls
        new Wall(Sunsartown, 1, 1, Direction.NORTH);
        new Wall(Sunsartown, 1, 1, Direction.WEST);
        new Wall(Sunsartown, 1, 2, Direction.NORTH);
        new Wall(Sunsartown, 2, 1, Direction.WEST);
        new Wall(Sunsartown, 2, 2, Direction.EAST);
        new Wall(Sunsartown, 2, 2, Direction.SOUTH);
        new Wall(Sunsartown, 1, 2, Direction.EAST);
        new Wall(Sunsartown, 2, 1, Direction.SOUTH);


        //give robot the label "s"
        sunsar.setLabel("s");




        //make sunsar move
        sunsar.move();
        sunsar.move();

        int moveCount = 0;

        //make sunsar turn right
        sunsar.turnLeft();

        //while loop 
        while (true) {

            while (moveCount < 22) {


                //make sunsar move 3 times then turn left until it has done 2 loops
                sunsar.move();

                moveCount = moveCount + 1;

                if (moveCount < 22) {


                    sunsar.move();

                    moveCount = moveCount + 1;

                }

                if (moveCount < 22) {


                    sunsar.move();

                    moveCount = moveCount + 1;


                }
                //make sunsar turn right
                sunsar.turnLeft();





            }

        }




    }
}
