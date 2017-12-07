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
    public void examGrade(double examMark) {

       double noRemander;        
       
               //go through
        for (int i = 0; i < examMark; i++) {

            
            
            if (int i % 2 ) {

    }
        

          System.out.println( noRemander );
        }
        
        
    public static void main(String[] args) {


        A7Q3 test = new A7Q3();

        // ask for the percentage grade
        System.out.println("please enter a number to find all of the numbers that will divide the number equaly ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new double called examMark
        double examMark = in.nextDouble();

        //new double examGrade uses the examMark
        test.examGrade(examMark);





    }
}
