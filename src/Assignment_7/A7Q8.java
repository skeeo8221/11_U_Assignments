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
    //double void type means it does not need to send answer
    public boolean allDigitsOdd(int number) {

        //turn negatives into positives
        if (number < 0) {

            // multiply the number by -1 to turn negatives
            number = number * -1;

        }

        //if the number                                                                                                           
        if (number == 0) {

            //
            return false;
        }

        //find the last digit of the entered number
        while (number > 0) {

            if (number % 2 == 0) {

                return false;

            }

            number = number / 10;

        }

        return true;

    }

    public static void main(String[] args) {

        A7Q8 test = new A7Q8();

        // ask for a number to have its first digit identified
        System.out.println("please enter the number that you want find the first digit of ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new integer called number witch holds the entered number and will turn into the last digit
        int number = in.nextInt();

        if (test.allDigitsOdd(number)) {

            // ask for a number to have its first digit identified
            System.out.println("all digits are odd ");

        } else {

            System.out.println("atleast one digit is even ");

        }
    }
}
