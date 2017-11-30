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

        //a new integer array to store the ten numbers
        int[] numbers = new int[10];

        //print "enter the value of the ten marks"
        System.out.println("enter the value of the ten marks");

        //use a loop to get all the info
        for (int i = 0; i < numbers.length; i++) {

            //create scanner to use as input
            Scanner input = new Scanner(System.in);

            //the array input is the next line
            numbers[i] = input.nextInt();

        }

        //use the following statements to sort the 10 marks into acsending order

        // go through the array one spot at a time
        for (int x = 0; x < numbers.length - 1; x++) {

            //go through the array minus the last number, going through one less each time
            for (int y = 0; y < numbers.length - x - 1; y++) {

                //if the number being adressed is bigger than the number ahead of it
                if (numbers[y] > numbers[y + 1]) {

                    //swap the places in the array of the integers using the placeholder variable
                    placeHolder = numbers[y];

                    numbers[y] = numbers[y + 1];

                    numbers[y + 1] = placeHolder;

                }
            }
        }


        //print the title for the outputed numbers
        System.out.println("the values you entered in ascending value are:");

        //go threw each spot on the array
        for (int x = 0; x < numbers.length; x++) {

            //print each number as it is adressed in the for statement
            System.out.println(numbers[x]);

        }

    }
}
