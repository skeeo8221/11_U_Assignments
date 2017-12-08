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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    //double void type means it does not need to send answer
    public void divisableNumbers(double enteredNumber) {

       //go through all numbers between 0 and the enterd number
        for (int i = 0; i < enteredNumber; i++) {
            
            //if the remander of the entered number is zero, print out the number
            if (enteredNumber % i == 0 ) {
                
          System.out.println( i );
        }
        }
      //after all divisable numbers have been entered, pint out the entered number
      System.out.println( enteredNumber );
    }
        
    public static void main(String[] args) {

        
        A7Q3 test = new A7Q3();

        // ask for the number that will be divided by the other numbers
        System.out.println("please enter a number to find all of the numbers that will divide the number equaly ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new double called entered number
        int enteredNumber = in.nextInt();

        //divisableNumbers uses the enteredNumber
        test.divisableNumbers(enteredNumber);





    }
}
