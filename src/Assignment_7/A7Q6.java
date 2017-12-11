/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author owen
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    //double void type means it does not need to send answer
    public void lastDigit(int number) {

        //turn negatives into positives
        if (number < 0) {

            number = number * -1;

        }

        //find the last digit of the entered number
        number = number % 10;

        //print out the last digit of the entered number
        System.out.println("the last digit of the number you entered is " + number);

    }

    public static void main(String[] args) {

        A7Q6 test = new A7Q6();

        // ask for a number to have its last digit identified
        System.out.println("please enter the number of line disired ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new integer called number witch holds the entered number and will turn into the last digit
        int number = in.nextInt();

        test.lastDigit(number);

    }
}
