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
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    //double return type means it needs to send answer
    public double areaOfCircle(double radius) {

        //do equation to determine area from radius
        double answer = radius * radius * Math.PI;

        //send back the answer
        return answer;
        
    }

    public static void main(String[] args) {
        
        
        A7Q1 test = new A7Q1();

        // ask for the radius of the circle
        System.out.println("please enter the radius of the circle");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new double called radius
        double radius = in.nextDouble();

        //new double area of circle uses the radius
        double areaOfCircle = test.areaOfCircle(radius);

        //print the area of the circle
        System.out.println("the area of the circle is " + areaOfCircle);



    }
}
