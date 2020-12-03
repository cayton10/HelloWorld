/**
 *
 * @author BPC
 */

//First java programming experience!
import java.lang.System;
//For reading user input
import java.util.Scanner;



//Packages similar to creating C++ namespaces
//Not required, but recommended to separate YOUR code from
//external libs / teammate code, etc.

//Everything in Java MUST contained in a class
//Somewhat similar to C#
public class Main 
{
    //Entry point
    public static void main(String[] args)
    {
        //C++ Equiv:
        //cout << "Hello, World" << endl;
        
        //First console message!
        System.out.println("Hello, World");
        
        System.out.print("This ");
        System.out.print("is ");
        System.out.print("a ");
        System.out.print("sentence");
        System.out.print(".");
        
        //Have user type in two numbers and print them
        int num1 = 0;
        int num2= 0;
        
        //Instantiate scanner, which is our workaround for reading inputs
        Scanner scanner = new Scanner(System.in);
        //Scanner class comes with a host of methods for reading info from user
        
        //Prompt user
        System.out.println();
        System.out.println("Please enter two integers (whole numbers)");
        
        //User enters info
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        
        //Print these numbers for user to see
        System.out.println("First number: " + num1 + " Second number: " + num2);
        
        
        
        
    }
    
}
