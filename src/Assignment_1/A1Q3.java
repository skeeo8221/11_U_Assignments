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
public class A1Q3 {


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
     Robot sunsar = new Robot(Sunsartown, 3, 0, Direction. EAST);
   
     new Wall(Sunsartown, 3, 2, Direction.WEST);
     new Wall(Sunsartown, 3, 2, Direction.NORTH);
     new Wall(Sunsartown, 2, 3, Direction.WEST);
     new Wall(Sunsartown, 1, 3, Direction.WEST);
     new Wall(Sunsartown, 2, 4, Direction.NORTH);
     new Wall(Sunsartown, 2, 4, Direction.EAST);
     new Wall(Sunsartown, 1, 3, Direction.NORTH);
     new Wall(Sunsartown, 3, 4, Direction.EAST);
     new Wall(Sunsartown, 1, 3, Direction.EAST);
           
     
     //create newspaper
     Thing t = new Thing(Sunsartown, 3,1);
       
     
     //make newspaper black
     t.setColor(Color.black);
     
     //set sunsars color to black
     sunsar.setColor(Color.black);
     

    
     //get sunsar to move
     sunsar.move();
     //get sunsar to turn left
     sunsar.turnLeft();
     //get sunsar to move
     sunsar.move();
     //get sunsar to turn left
     sunsar.turnLeft();
     sunsar.turnLeft();
     sunsar.turnLeft();
     //get sunsar to move
     sunsar.move();
     //get sunsar to turn left
     sunsar.turnLeft();
     //get sunsar to move
     sunsar.move();
     sunsar.move();
     //get sunsar to turn left
     sunsar.turnLeft();
     sunsar.turnLeft();
     sunsar.turnLeft();
     //get sunsar to move
     sunsar.move();
     sunsar.move();
     //get sunsar to turn left
     sunsar.turnLeft();
     //get sunsar to move
     sunsar.move();
     sunsar.move();
     //get sunsar to turn left
     sunsar.turnLeft();
     sunsar.turnLeft();
     sunsar.turnLeft();
     //get sunsar to put down thing
     sunsar.putThing();
        
    }
}
