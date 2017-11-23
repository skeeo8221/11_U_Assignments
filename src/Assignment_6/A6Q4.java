/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author skeeo8221
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
    

        //new variable to hold the place of an integer when swaping places
        int placeHolder = 0;

        //a new integer array to store the two numbers
        int[] numbers = new int[10];


        //print "enter the value of the two numbers"
        System.out.println("enter the value of the ten marks");


        //use a loop to get all the info
        for (int i = 0; i < numbers.length; i++) {

            //create scanner to use as input
            Scanner input = new Scanner(System.in);

            //the array input is the next line
            numbers[i] = input.nextInt();

        }

        //if the two nubers are already in the right order
        if (numbers[0] < numbers[1]) {

            //print the two numbers in ascending order
            System.out.println(numbers[0] + " then " + numbers[1] + " (in ascending order)");

        } else {



            //swap the places in the array of the integers using the placeholder variable
            placeHolder = numbers[0];

            numbers[0] = numbers[1];

            numbers[1] = placeHolder;


            //print the two numbers in ascending order
            System.out.println(numbers[0] + " then " + numbers[1] + " (in ascending order)");


        }
    }
}
    
    
    

