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
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    //double void type means it does not need to send answer
    public void examGrade(double examMark) {


        // sort the marks into the letter grades that they belong in
        if (examMark < 50) {
            //print the letter mark
            System.out.println("letter grade from yor exam is F ");
        }
        if (examMark < 59 && examMark > 50) {
            //print the letter mark
            System.out.println("letter grade from yor exam is D ");
        }
        if (examMark < 69 && examMark > 60) {
            //print the letter mark
            System.out.println("letter grade from yor exam is C ");
        }
        if (examMark < 79 && examMark > 70) {
            //print the letter mark
            System.out.println("letter grade from yor exam is B ");
        }
        if (examMark > 80) {
            //print the letter mark
            System.out.println("letter grade from yor exam is A ");
        }
    }

    public static void main(String[] args) {


        A7Q2 test = new A7Q2();

        // ask for the percentage grade
        System.out.println("please enter the value of the grade you got on your exam");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new double called examMark
        double examMark = in.nextDouble();

        //new double examGrade uses the examMark
        test.examGrade(examMark);





    }
}
