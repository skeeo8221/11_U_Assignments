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
 
        //new variable to hold the place of an integer when swaping places
        int placeHolder = 0;



        //print "how many marks will you be entering?"
        System.out.print("how many marks will you be entering?");

        //create scanner to use as input
        Scanner input = new Scanner(System.in);

        //new integer numStudents is next line
        int numMarks = input.nextInt();


        //an array to store the student marks
        int[] numbers = new int[numMarks];


        //print "enter the value of the" (the number of marks that they will be entering)"marks"
        System.out.println("enter the values of the " + numMarks + " marks");

        //use a loop to get all the info
        for (int i = 0; i < numbers.length; i++) {


            //the array input is the next line
            numbers[i] = input.nextInt();

        }

        //use the following statements to sort the 10 marks into acsending order

        // go through the array one spot at a time
        for (int x = 0; x < numbers.length - 1; x++) {

            //go through the array minus the last number, going through one less each time
            for (int y = 0; y < numbers.length - x - 1; y++) {

                //if the number being adressed is bigger than the number ahead of it
                if (numbers[y] > numbers[y + 1]) {

                    //swap the places in the array of the integers using the placeholder variable
                    placeHolder = numbers[y];

                    numbers[y] = numbers[y + 1];

                    numbers[y + 1] = placeHolder;

                    
                    
                }
            }
        
        }  
        
        //print the title for the outputed numbers
        System.out.println("the values you entered in ascending value are:");

        //go threw each spot on the array
        for (int x = 0; x < numbers.length; x++) {

            //print each number as it is adressed in the for statement
            System.out.println(numbers[x]);
                    
        }         
                    
                    
        //calculate the average of the numbers               
         int g = 0;
        
          for (int i = 0; i < numbers.length; i++) {
            
              g = g + numbers[i];
              
          }
              double total = g / numbers.length;
                    
          
                    
                     //print the title for the outputed numbers
        System.out.println("therefore the class average is " + total);
                    
                     
                     //print the title for the outputed numbers
        System.out.println("therefore the lowest mark in the class is " + numbers[0]);
        
                     
                     //print the title for the outputed numbers
        System.out.println("therefore the highest mark in the class is " + numbers[numMarks-1]);
        
           
                }
            }

