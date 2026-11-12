/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mejillano_problem3;

import java.util.Scanner;

/**
 *
 * @author Prince Dary
 */
public class Mejillano_Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        input.useDelimiter("[,\\s]+");
        
        System.out.println("How many numbers?");
        int index = input.nextInt(); //amount of numbers in an array
        if (index == 0) {
            System.out.println("Invalid. An array needs at least one value.");
        }
        int values [] = new int [index];
        
        // loop for the input of values for the array
        for (int i = 0; i < index; i++) {
            System.out.println("Please enter number " + (i + 1) + " :");
            values [i] = input.nextInt();
        }   
            
        //results
        System.out.println("Sum of numbers: " + arraySum (values, 0));
        System.out.println("Largest number: " + findMaximum (values, 0));
        System.out.println("Number of Even numbers: " + countEven (values, 0));
        }
    
    // method one for finding the sum
    public static int arraySum (int[] values, int index){
        //base case
        if (index == values.length) {
            return 0;
        }
        //recursive case
        return values [index] + arraySum (values, index + 1);
    }

    //method two for finding the maximum
    public static int findMaximum (int[] values, int index) {
        //base case
        if (index == values.length - 1) {
            return values [index];
        }
        
        //recursive case
        int max = findMaximum (values, index + 1);
        
        if (values [index] > max) {
            return values [index];
        } else 
            return max;
    }

    //method three for finding how many even numbers are in the array
    public static int countEven (int[] values, int index) {
        //base case
        if (index == values.length) {
            return 0;
        } 
        
        //recursive case
        if (values [index] % 2 == 0) {
            return 1 + countEven (values, index + 1);
        } else 
            return countEven (values, index + 1);
    }
}