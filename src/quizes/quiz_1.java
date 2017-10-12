/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author skeeo8221
 */
public class quiz_1 {
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
        Thing a = new Thing(Sunsartown, 1, 3);
        Thing b = new Thing(Sunsartown, 1, 4);
        Thing c = new Thing(Sunsartown, 1, 5);
       

        
         //create walls
        new Wall(Sunsartown, 1, 3, Direction.NORTH);
        new Wall(Sunsartown, 1, 4, Direction.NORTH);
        new Wall(Sunsartown, 1, 5, Direction.NORTH);
        new Wall(Sunsartown, 1, 3, Direction.SOUTH);
        new Wall(Sunsartown, 1, 4, Direction.SOUTH);
        new Wall(Sunsartown, 1, 5, Direction.SOUTH);
        new Wall(Sunsartown, 1, 5, Direction.EAST);
        new Wall(Sunsartown, 1, 1, Direction.WEST);
        
       
        //new variable that counts things picked up
        int thingCount = 0;

        
        
        //while loop if less than 10 things have been moved
        while (true) {
            
            
            
         while (thingCount < 3) {
            
             if (sunsar.frontIsClear()) {

             if (sunsar.canPickThing()){
                 
                 
                 sunsar.pickThing();
                 sunsar.turnLeft();
                 sunsar.turnLeft();
              
                 
                 thingCount = thingCount + 1;
                 
                 
             }else{
                 

                      sunsar.move();
                 
             }
             }
          if (sunsar.frontIsClear()) {
              
              
          }else{ 
              
             
                      
                  sunsar.turnLeft();
                  sunsar.turnLeft();
                  
                  sunsar.getDirection();
                          
                  if (sunsar.getDirection() == Direction.EAST) {
                
                     sunsar.putThing();
                     sunsar.move();
                 }
        }

    }

        
                sunsar.turnLeft();
                sunsar.turnLeft();
                
                 sunsar.move();
                  sunsar.move();
                   sunsar.move();
                  sunsar.move();
                  
                  sunsar.turnLeft();
                sunsar.turnLeft();
                
                
                  break;
        }
}
}
}