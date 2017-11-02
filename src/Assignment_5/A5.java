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

        int a = 0;


        while (a < 1) {




            //ask for word to translate
            System.out.print("please enter a word");

            //vreate scanner to use as input
            Scanner words = new Scanner(System.in);



            String word = words.nextLine();


            String ex = "EXIT";

            String ss = "sunsar";

            word = word.toLowerCase();

            if (word.equals(ss)) {

                System.out.print("sunscreen");


                break;

            }


            if (word.equals(ex)) {

                System.out.print("you have typed exit");


                break;

            } else {


                String translate = "";

                Boolean foundvowel = false;

                for (int i = 0; i < word.length(); i++) {

                    if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == false) {

                        translate = translate + "ub";

                        translate = translate + word.charAt(i);

                        foundvowel = true;


                    } else {

                        if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == true) {


                            translate = translate + word.charAt(i);

                        } else {


                            translate = translate + word.charAt(i);
                            
                            
                            
                            foundvowel = false;



                        }
                    }
                }


                //display the translated text
                System.out.print(translate);

                
                a = a + 1;

            }
        }
    }
}