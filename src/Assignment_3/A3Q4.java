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
public class A3Q4 {

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
        Robot sunsar = new Robot(Sunsartown, 3, 3, Direction.SOUTH);





        //give robot the label "s"
        sunsar.setLabel("s");

        //create top left square
        new Wall(Sunsartown, 1, 1, Direction.NORTH);
        new Wall(Sunsartown, 1, 2, Direction.NORTH);
        new Wall(Sunsartown, 2, 1, Direction.WEST);
        new Wall(Sunsartown, 1, 1, Direction.WEST);
        new Wall(Sunsartown, 2, 2, Direction.EAST);
        new Wall(Sunsartown, 1, 2, Direction.EAST);
        new Wall(Sunsartown, 2, 1, Direction.SOUTH);
        new Wall(Sunsartown, 2, 2, Direction.SOUTH);


        //create top right square
        new Wall(Sunsartown, 1, 4, Direction.NORTH);
        new Wall(Sunsartown, 1, 5, Direction.NORTH);
        new Wall(Sunsartown, 2, 4, Direction.WEST);
        new Wall(Sunsartown, 1, 4, Direction.WEST);
        new Wall(Sunsartown, 2, 5, Direction.EAST);
        new Wall(Sunsartown, 1, 5, Direction.EAST);
        new Wall(Sunsartown, 2, 4, Direction.SOUTH);
        new Wall(Sunsartown, 2, 5, Direction.SOUTH);


        //create bottem right square
        new Wall(Sunsartown, 4, 4, Direction.NORTH);
        new Wall(Sunsartown, 4, 5, Direction.NORTH);
        new Wall(Sunsartown, 5, 4, Direction.WEST);
        new Wall(Sunsartown, 4, 4, Direction.WEST);
        new Wall(Sunsartown, 5, 5, Direction.EAST);
        new Wall(Sunsartown, 4, 5, Direction.EAST);
        new Wall(Sunsartown, 5, 4, Direction.SOUTH);
        new Wall(Sunsartown, 5, 5, Direction.SOUTH);


        //create bottem left square
        new Wall(Sunsartown, 4, 1, Direction.NORTH);
        new Wall(Sunsartown, 4, 2, Direction.NORTH);
        new Wall(Sunsartown, 5, 1, Direction.WEST);
        new Wall(Sunsartown, 4, 1, Direction.WEST);
        new Wall(Sunsartown, 5, 2, Direction.EAST);
        new Wall(Sunsartown, 4, 2, Direction.EAST);
        new Wall(Sunsartown, 5, 1, Direction.SOUTH);
        new Wall(Sunsartown, 5, 2, Direction.SOUTH);



        //new integers count coves, count turns(loops)(not total), and count total loops (turns)
        int moveCount = 0;
        int moveLoopCount = 0;
        int totalLoopCount = 0;



//if movecount is less than 3 get sunsar to move (move along the side of one square)
        while (true) {

            if (moveCount < 3) {






                sunsar.move();

                moveCount = moveCount + 1;


                //turn between the squares and continue forward
            } else {

                if (moveLoopCount == 2) {

                    moveLoopCount = moveLoopCount - 2;

                    sunsar.turnLeft();
                    sunsar.move();
                    sunsar.move();
                    sunsar.move();
                    sunsar.move();
                    sunsar.move();
                    sunsar.move();


                } else {

                    sunsar.turnLeft();

                    moveCount = moveCount - 3;
                    moveLoopCount = moveLoopCount + 1;
                    totalLoopCount = totalLoopCount + 1;

                    // return to center
                    if (totalLoopCount == 8) {

                        sunsar.move();
                        sunsar.move();
                        sunsar.move();

                        sunsar.turnLeft();

                        sunsar.move();
                        sunsar.move();
                        sunsar.move();


                        break;

                    }

                }

            }


        }

    }
}
