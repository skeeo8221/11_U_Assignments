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
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    //double void type means it does not need to send answer
    public void asterisk(int lines, int randNum) {

        for (int i = 0; i < lines; i++) {


            if (randNum = 1) {
                
                System.out.println("*");
            }

            
            
            
            if (randNum = 2) {
                
                System.out.println("**");
            }

            
            
            
            if (randNum = 3) {
            
                System.out.println("***");
            }

            
            
            
            if (randNum = 4) {
            
                System.out.println("****");
            }

            

            
            if (randNum = 5) {
                System.out.println("*****");
            }


            
        }
    }

    public static void main(String[] args) {


        A7Q5 test = new A7Q5();

        // ask for initial balence of the acount
        System.out.println("please enter the number of line disired ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new integer called balence
        int lines = in.nextInt();


        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
        
                
        test.asterisk(lines, randNum);


    }
}