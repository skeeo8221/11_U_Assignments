/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author skeeo8221
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here





        //create a scanner for input
        Scanner input = new Scanner(System.in);


        //loop after finished
        while (true) {


            //ask for speed limit
            System.out.println("enter the speed limit: ");


            //speed limit typed
            double speedLimit = input.nextDouble();



            //ask for speed of car
            System.out.println("enter the speen of your car: ");



            //speed of car typed
            double speedCar = input.nextDouble();

            //if speed is between 1 and 21 over limit $100 fine
            if ((speedCar - speedLimit) < 21) {

                if ((speedCar - speedLimit) > 1) {




                    System.out.println("your speeding fine is 100$");


                }
            }

            //if speed is between 31 and 20 over limit $270 fine
            if ((speedCar - speedLimit) < 31) {

                if ((speedCar - speedLimit) > 20) {




                    System.out.println("your speeding fine is 270$");


                }
            }



            //if speed is more than 30 over limit $500 fine
            if ((speedCar - speedLimit) > 30) {




                System.out.println("your speeding fine is 500$");


            }
        }


    }
}
