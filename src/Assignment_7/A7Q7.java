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
public class A7Q7 {
  /**
     * @param args the command line arguments
     */
    //double void type means it does not need to send answer
    public void lastDigit(int number) {

        
        //turn negatives into positives
        if (number < 0) {

            number = number * -1;

        }

        
           while ( number > 9) {
        
        //find the first digit of the entered number
        number = number / 10;

           }
           
        //print out the first digit of the entered number
        System.out.println("the first digit of the number you entered is " + number);

    
    }

    public static void main(String[] args) {

        A7Q7 test = new A7Q7();

        // ask for a number to have its first digit identified
        System.out.println("please enter the number that you want find the first digit of ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new integer called number witch holds the entered number and will turn into the last digit
        int number = in.nextInt();

        test.lastDigit(number);

    }
}
