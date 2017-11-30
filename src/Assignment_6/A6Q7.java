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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here






        //an array to store the student marks
        int[] numbers = new int[1000];


        //use a loop to populate the array (2 to 1000)
        for (int i = 0; i < 1000; i++) {
            numbers[i] = i + 2;
        }

        //go through
        for (int i = 0; i < 1000; i++) {

            //if we have not marked the number as 0
            if (numbers[i] > 0) {

                //multiplier is the number that is being looked at
                int multiplier = numbers[i];

                //find the non prime numbers by multiplying the "multiplier" into larger numbers
                for (int j = multiplier * 2 - 2; j < 1000; j = j + multiplier) {

                    // mark all of the non prime identified numbers as 0
                    numbers[j] = 0;
                }
            }
        }






        //explanation for the following numbers
        System.out.println("the values of all of the prime numbers between 2 and 1000 are as follows:");

        //go through each spot on the array
        for (int x = 0; x < 1000; x++) {

            //if the number being looked as is not marked as a zero (or just greater than 0)
            if (numbers[x] > 0) {


                //print each number as they are in the array
                System.out.print(numbers[x] + ", ");

            }


        }

    }
}
