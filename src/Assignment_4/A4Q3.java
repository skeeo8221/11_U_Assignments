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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        //ask for numbers
        System.out.println("please enter four numbers on seperate lines");



        //create a scanner for input
        Scanner input = new Scanner(System.in);

        //first number typed
        double numbers = input.nextDouble();

        //second number typed
        double numbers2 = input.nextDouble();

        //third number typed
        double numbers3 = input.nextDouble();

        //fourth number typed
        double numbers4 = input.nextDouble();

        
        //output all numbers to the screen with commas between each
        System.out.println(numbers + ", " + numbers2 + ", " + numbers3 + ", " + numbers4 + ", ");































    }
}
