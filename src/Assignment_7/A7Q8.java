/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author skeeo8221
 */
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    //double boolean type means it will send an answer
    public boolean allDigitsOdd(int number) {

        //turn negatives into positives
        if (number < 0) {

            // multiply the number by -1 to turn negatives
            number = number * -1;

        }

        //if the number is zero, it will be treated as even                                                                                                          
        if (number == 0) {

            //this means atleast one digit is even
            return false;
        }

        //will the number is greater than 0, continue to find the remainder
        while (number > 0) {

            //if there is no remainder (then ere is an even digit in the number)
            if (number % 2 == 0) {

                //this means atleast one digit is even
                return false;

            }

            //divide the number by ten, then go through the while loop again
            number = number / 10;

        }

        //this means all digits are odd
        return true;

    }

    public static void main(String[] args) {

        A7Q8 test = new A7Q8();

        // ask for a number to deterine iff all digits are odd
        System.out.println("please enter a number no ditirmine if all of its digits are odd ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new integer called number witch holds the entered number and will turn into the last digit
        int number = in.nextInt();

        //if the boolean resulted as true
        if (test.allDigitsOdd(number)) {

            //print in tha all of the digits are odd
            System.out.println("all digits are odd ");

        } else {

            //print in that atleast one of the digits is even
            System.out.println("atleast one digit is even ");

        }
    }
}
