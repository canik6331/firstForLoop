/*
 *10/03/20
 *cameron nikolasevic
 *this program promts the user to choose a number 
 *from 1-4 and tells the user what it should output.
 *it will then output a counter in the console based
 * on the users selection.
 */

package firstforloops;
import java.util.Scanner;

/**
 *
 * @author canik6331
 */
public class FirstForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //output the user selection
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter your choice:");
        System.out.println("1... 0 to 10 by 1");
        System.out.println("2... 100 to 0 by 10");
        System.out.println("3... 50 to 500 by 50");
        System.out.println("4... 6000 to 1000 by 1000");
        int input = keyboard.nextInt(); //user input
        
        //decide the output
    if(input == 1){
        System.out.println("you have chosen 0 to 10 by 1");
        System.out.println("");
        for(int i = 0; i <= 10; i++)
        {System.out.println(i);}   
    }
    else if(input == 2){
        System.out.println("You have chosen 100 to 0 by 10");
        System.out.println("");
        for(int i = 100; i >= 0 ; i-=10)
        {System.out.println(i);}        
    }
    else if (input == 3){
        System.out.println("You have chosen 50 to 500 by 50");
        System.out.println("");
        for(int i = 50; i <=500 ; i+=50)
        {System.out.println(i);}
    }
    else if (input == 4){
        System.out.println("You have chosen 6000 to 1000 by 1000");
        System.out.println("");
        for(int i = 6000; i >= 1000; i-=1000)
        {System.out.println(i);}
    }
    else{
        System.out.println("Invalid response");
    } 

            
                
        }
            
    }
    

