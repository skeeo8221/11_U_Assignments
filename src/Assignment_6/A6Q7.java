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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 



        

        //an array to store the student marks
        int[] numbers = new int[1000];


        //use a loop to populate the array (2 to 1000)
        for (int i = 0; i < 1000; i++) {
            numbers[i] = i + 2;
        }
     
        for (int i = 0; i < 1000; i++) {
            
            if (numbers[i] > 0) {
                
                int multiplier = numbers[i];
                
                for (int j = multiplier * 2 -2; j < 1000; j = j + multiplier) {
    
                    numbers[j] = 0;
                }
            }
        }
        
        
        
        
      
        
        //print the title for the outputed numbers
        System.out.println("the values of all of the prime numbers between 2 and 1000 are as follows:");

        //go threw each spot on the array
        for (int x = 0; x < 1000; x++) {

              if (numbers[x] > 0) {
            
                  
            //print each number as it is adressed in the for statement
            System.out.print(numbers[x] + ", ");
                    
        }         
                    
                 
    }
    
                }
            }
