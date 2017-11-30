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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here




        //print "how many hieghts will you be entering?"
        System.out.print("how many hieghts will you be entering?");

        //create scanner to use as input
        Scanner input = new Scanner(System.in);

        //new integer numStudents is next line
        int numHeights = input.nextInt();


        //an array to store the student marks
        double[] studentHeights = new double[numHeights];

        //use a loop to get all the info
        for (int i = 0; i < studentHeights.length; i++) {

            //print "enter the height of person # (the number of the person being asked) in meter:"
            System.out.println("enter the height of person #" + (i + 1) + " in meter:");

            //i is next line
            studentHeights[i] = input.nextDouble();


        }
        //add all expences up
        double total = 0;

        //int i = 0 at start then represents the student height number
        for (int i = 0; i < studentHeights.length; i++) {

            //add student heights to total
            total = total + studentHeights[i];


        }
        //round average to 2 decimal places
        double average = Math.round((double) total * 100 / studentHeights.length) / 100.0;

        //check i at 0 then keep adding 1 to i until end of aray
        for (int i = 0; i < studentHeights.length; i++) {

            //if the height is greater than average
            if (studentHeights[i] > average) {

                //print concluding scentence    
                System.out.println("the above average heights are " + studentHeights[i] + " m");


            }

        }
    }
}
