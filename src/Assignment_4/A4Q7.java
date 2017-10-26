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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here





        //create a scanner for input
        Scanner input = new Scanner(System.in);

        //ask for sum of dice
        System.out.println("enter sum of dice: ");


        //new int diceRoll is the sum of the dice rolled by the player
        int diceRoll = input.nextInt();

        //if dice roll is posible with 2 dice
        while (diceRoll < 2 || diceRoll > 12) {

            // print roll again
            System.out.println("roll again: ");

            diceRoll = input.nextInt();

        }



        //loop after finished
        for (int spotNumber = diceRoll + 1; !(spotNumber == 100); spotNumber = spotNumber + diceRoll) {

            // if player reaches 100 exactly, print you win and end the game
            if (spotNumber == 100) {

                System.out.println("you win!");

                break;
            }


            //if player lands on snake move down to designated spot
            if (spotNumber == 54) {

                spotNumber = spotNumber - 35;

            }



            if (spotNumber == 90) {

                spotNumber = spotNumber - 42;

            }


            if (spotNumber == 54) {

                spotNumber = spotNumber - 35;

            }


            if (spotNumber == 99) {

                spotNumber = spotNumber - 22;

            }

            //if player lands on ladder move up to designated spot       
            if (spotNumber == 9) {

                spotNumber = spotNumber + 25;

            }



            if (spotNumber == 40) {

                spotNumber = spotNumber + 24;

            }



            if (spotNumber == 67) {

                spotNumber = spotNumber + 19;

            }





            // if spot number is more than 100, inform player then move to previouse position      
            if (spotNumber > 100) {

                System.out.println("over 100 try again: ");

                spotNumber = spotNumber - diceRoll;

            }

            //display current spot number 
            System.out.println("you are now on square " + spotNumber);

            diceRoll = input.nextInt();

            //if roll is posible with 2 dice
            while (diceRoll < 2 || diceRoll > 12) {


                System.out.println("roll again: ");

                diceRoll = input.nextInt();





            }


        }

        // desplay you win then end game
        System.out.println("You are now on square 100 ");
        System.out.println("You Win! ");
    }
}
