/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_5;

import java.util.Scanner;

/**
 *
 * @author skeeo8221
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //new integer "A" with a starting value of 0
        int a = 0;

        //a will be greater than 1 when the words are finished therfor, this will loop until it has finished the words
        while (a < 1) {


            //ask for word or words to translate
            System.out.print("please enter a word");

            //create scanner to use as input
            Scanner words = new Scanner(System.in);

            //new string "word"
            String word = words.nextLine();

            //string "ex" for if "EXIT" is typed
            String ex = "EXIT";

            //string "ss" for if "sunsar" is typed
            String ss = "sunsar";

            //translate all letters typed to lower case
            word = word.toLowerCase();

            //if "sunsar" was typed 
            if (word.equals(ss)) {

                //print translated to "alec"
                System.out.print("alec");

                break;

            }

            //if "EXIT" was typed 
            if (word.equals(ex)) {

                //print translated to "you have typed exit"
                System.out.print("you have typed exit");

                break;
                
            //if "EXIT" was not typed
            } else {

                //new string translate
                String translate = "";

                //vowel not found
                Boolean foundvowel = false;

                //int "i" is the word length
                for (int i = 0; i < word.length(); i++) {

                    //if a charecter is a vowel and found vowel is false
                    if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == false) {

                        //add "ub" befor the found vowel
                        translate = translate + "ub";
                        
                        //add in the charecter that "i" is representing
                        translate = translate + word.charAt(i);
                        
                        //make foundvowel true
                        foundvowel = true;
                        
                    //if a charecter is not a vowel and/or found vowel is not false    
                    } else {
                        
                        //if a charecter is a vowel and found vowel is false
                        if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == true) {

                            //add in the charecter that "i" is representing
                            translate = translate + word.charAt(i);

                        } else {

                            //add in the charecter that "i" is representing
                            translate = translate + word.charAt(i);
                            
                            //make foundvowel false
                            foundvowel = false;



                        }
                    }
                }


                //display the translated text
                System.out.print(translate);

                //end while statement by adding one to a, making a not less than 1
                a = a + 1;

            }
        }
    }
}