/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissors;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         //declaring variables
         String continueYN = "";
         double aMove = 0;
         double bMove = 0;
         boolean done = false;
         //asing for player A's move
         System.out.println("What is player A's move? (RPS)");
         do
         {
            if(in.hasNextDouble())
            {
                aMove = in.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("That us not a valid move! Would you like to try again? (Y/N)");
                continueYN = in.next();
            }
         }while(continueYN.equalsIgnoreCase("Y"));
         
         done = true;
         do
         {
            System.out.println("What is player B's move? (RPS)");
            //asking for player B's move
            if (in.hasNextDouble())
            {
                bMove = in.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("That us not a valid move! Would you like to try again? (Y/N)");
                continueYN = in.next();
            }
           
         }while(continueYN.equalsIgnoreCase("Y"));
         //all 9 possible combinations with oputputs
         do
         {
             if ((aMove) == 1)
             {
                 if ((bMove) == 1)
                 {
                     System.out.println("Rock vs Rock. It's a Tie!");
                 }
                 else if ((bMove) == 2)
                 {
                     System.out.println("Paper covers Rock. Player B wins! ");
                 }
                 else if ((bMove) == 3)
                 {
                     System.out.println("Rock breaks Scissors. Player A wins!");
                 }
                 
                 
             }
             else if ((aMove) == 2)
             {
                 if ((bMove) == 1)
                 {
                     System.out.println("Paper covers Rock. Player A wins!");
                 }
                 else if ((bMove) == 2)
                 {
                     System.out.println("Paper vs. Paper. It's a Tie!");
                 }
                 else if ((bMove) == 3)
                 {
                     System.out.println("Scissors cuts paper. Player B wins!");
                 }
                
             }
             else if ((aMove) == 3)
             {
                 if ((bMove) == 1)
                 {
                     System.out.println("Rock breaks Scissors. Player B wins!");
                 }
                 else if ((bMove) == 2)
                 {
                     System.out.println("Scissors vuts Paper. Player A wins!");
                 }
                 else if ((bMove) == 3)
                 {
                     System.out.println("Scissors vs Scissors. It's a Tie!");
                 }
                 
             }
             
         }while (continueYN.equalsIgnoreCase("Y"));
    }
    
}
