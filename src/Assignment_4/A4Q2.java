/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author skeeo8221
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        //measurment
        System.out.println("please enter the measerment you wish to convert (in inches)");



        //create a scanner for input
        Scanner input = new Scanner(System.in);



        //measurment in inches variable
        double measurment = input.nextDouble();


        //convert inches to cm
        double cm = measurment *2.54;


        //output cm value to the screen
        System.out.println(measurment + " inches is the same as " + cm + " cm");










    }
}
