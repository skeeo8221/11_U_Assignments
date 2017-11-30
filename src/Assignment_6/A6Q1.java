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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        //print "how many students will you be entering marks for?"
        System.out.print("how many students will you be entering marks for?");

        //create scanner to use as input
        Scanner input = new Scanner(System.in);

        //new integer numStudents is next line
        int numStudents = input.nextInt();


        //an array to store the student marks
        double[] studentMarks = new double[numStudents];

        //use a loop to get all the info
        for (int i = 0; i < studentMarks.length; i++) {

            System.out.println("enter student marks:");

            studentMarks[i] = input.nextDouble();


        }
        //add all expences up
        double total = 0;

        for (int i = 0; i < studentMarks.length; i++) {

            total = total + studentMarks[i];


        }
        //round the average to 2 decimal places
        double average = Math.round((double) total * 100 / studentMarks.length) / 100.0;

        //print the concluding sentence
        System.out.println("the average mark is " + average + " percent");



    }
}
