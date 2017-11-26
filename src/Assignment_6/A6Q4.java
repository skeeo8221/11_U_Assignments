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

        //use the following statements to sort the 10 marks into the right order
        for (int x = 0; x < numbers.length - 1; x++) {

            for (int y = 0; y < numbers.length - x - 1; y++) {

                if (numbers[y] > numbers[y + 1]) {

                    //swap the places in the array of the integers using the placeholder variable
                    placeHolder = numbers[y];

                    numbers[y] = numbers[y + 1];

                    numbers[y + 1] = placeHolder;

                }
            }
        }

        System.out.println("values1");
        for (int x = 0; x < numbers.length; x++) {

            //print the two numbers in ascending order
            System.out.println(numbers[x]);

        }

    }

}
