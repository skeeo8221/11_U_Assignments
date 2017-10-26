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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here





        //create a scanner for input
        Scanner input = new Scanner(System.in);



        //ask for name
        System.out.println("Please enter your name ");


        //name typed
        String name = input.nextLine();



        //ask what the first test was out of
        System.out.println("what was the first test out of?");



        //first test out of typed
        double outOf1 = input.nextDouble();



        //ask what they got on the first test
        System.out.println("what did you get?");



        //what they got on the first test typed
        double mark1 = input.nextDouble();



        //ask what test was out of
        System.out.println("what was the second test out of??");


        //fourth number typed
        double outOf2 = input.nextDouble();


        //ask for test mark
        System.out.println("what did you get?");


        //line to type
        double mark2 = input.nextDouble();

        //ask what test was out of
        System.out.println("what was the third test out of?");


        //line to type
        double outOf3 = input.nextDouble();

        //ask for test mark
        System.out.println("what did you get?");



        //line to type      
        double mark3 = input.nextDouble();



        //ask what test was out of
        System.out.println("what was the fourth test out of??");



        double outOf4 = input.nextDouble();


        //ask for test mark
        System.out.println("what did you get?");


        //fourth number typed
        double mark4 = input.nextDouble();

        //ask what test was out of
        System.out.println("what was the fifth test out of?");


        //fourth number typed
        double outOf5 = input.nextDouble();



        //ask for test mark
        System.out.println("what did you get?");


        //fourth number typed
        double mark5 = input.nextDouble();





        System.out.println("test scores for " + name);

        System.out.println();

        //output all numbers to the screen with commas between each
        System.out.println(" test 1: " + (mark1 / outOf1) * 100 + "%" + "average " + (((mark1 / outOf1 * 100) + (mark2 / outOf2 * 100) + (mark3 / outOf3 * 100) + (mark4 / outOf4 * 100) + (mark5 / outOf5 * 100) / 5) + "%"));

        System.out.println();

        System.out.println(" test 2: " + (mark2 / outOf2) * 100 + "%");

        System.out.println();

        System.out.println(" test 3: " + (mark3 / outOf3) * 100 + "%");

        System.out.println();

        System.out.println(" test 4: " + (mark4 / outOf4) * 100 + "%");

        System.out.println();

        System.out.println(" test 5: " + (mark5 / outOf5) * 100 + "%");

        System.out.println();

        System.out.println();

        System.out.println(" average " + ((mark1 / outOf1 * 100) + (mark2 / outOf2 * 100) + (mark3 / outOf3 * 100) + (mark4 / outOf4 * 100) + (mark5 / outOf5 * 100)) / 5 + "%");


    }
}
