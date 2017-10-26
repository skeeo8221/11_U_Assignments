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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here





        //create a scanner for input
        Scanner input = new Scanner(System.in);



        //ask for numbers
        System.out.println("How much does the food for prom cost?");


        //first number typed
        double numbers = input.nextDouble();



        //ask for numbers
        System.out.println("How much does the DJ cost?");



        //second number typed
        double numbers2 = input.nextDouble();



        //ask for numbers
        System.out.println("How much does it cost to rent the hall?");



        //third number typed
        double numbers3 = input.nextDouble();



        //ask for numbers
        System.out.println("How much do the decorations cost?");


        //fourth number typed
        double numbers4 = input.nextDouble();


        //ask for numbers
        System.out.println("How much does it cost for staff?");


        //fourth number typed
        double numbers5 = input.nextDouble();

        //ask for numbers
        System.out.println("How much for miscellaneoes costs?");


        //fourth number typed
        double numbers6 = input.nextDouble();





        //output all numbers to the screen with commas between each
        System.out.println ("your total cost is " +  Math.ceil(numbers + numbers2 + numbers3 + numbers4 + numbers5 + numbers6) + " $ you will need to sell " + Math.ceil((numbers + numbers2 + numbers3 + numbers4 + numbers5 + numbers6) / 35) + " tickets to break even");








    }
}
