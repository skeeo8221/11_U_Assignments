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
public class A7Q8 {

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
       
  while ( number > 9) {

        if (number % 2 == 0) {
        
       
             number = number % 10;
            
             
              if (number <9) {
             
               //print out the first digit of the entered number
        System.out.println("the number you entered contains atleast one even number ");   
        }
        }else{
            
                //print out the first digit of the entered number
        System.out.println("the number you entered contains only odd numbers ");
         
        break;
        
        }
            
     
        
        
        }
       
    
    }

    public static void main(String[] args) {

        A7Q8 test = new A7Q8();

        // ask for a number to have its first digit identified
        System.out.println("please enter the number that you want find the first digit of ");

        //new scanner for input
        Scanner in = new Scanner(System.in);

        //new integer called number witch holds the entered number and will turn into the last digit
        int number = in.nextInt();

        test.lastDigit(number);

    }
}
