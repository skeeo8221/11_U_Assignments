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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    //double void type means it does not need to send answer
    public void currentBalence(double intrest, int balence, int numYears) {

        //the equation that detirmines the balence after intrest
        System.out.println(balence * Math.pow((1 + intrest), numYears));

    }

    public static void main(String[] args) {


        A7Q4 test = new A7Q4();

        // ask for initial balence of the acount
        System.out.println("please enter the initial balence of the acount ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new integer called balence
        int balence = in.nextInt();

        // ask for the anual intrest rate as a decimal value
        System.out.println("please enter the anual intrest rate as a decimal value ");

        //new double intrest
        double intrest = in.nextDouble();

        // ask for the number of years the acount will be accumulating intrest
        System.out.println("please enter the number of years the acount will be accumulating intrest ");

        //new integer called numYears
        int numYears = in.nextInt();


        //currentBalence uses the intrest, balence, numYears
        test.currentBalence(intrest, balence, numYears);
    }
}
