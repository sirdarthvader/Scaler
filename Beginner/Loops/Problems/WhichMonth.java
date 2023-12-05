// Problem Description

// Write a program to input an integer(A) from user and print the Ath month of the year.

// Months list: {January, February, March, April, May, June, July, August, September, October, November, December}


// Problem Constraints

// 1 <= A <= 12



// Input Format

// One line containing an integer integer A.



// Output Format

// One line containing the Ath month of the year.



// Example Input

// Input 1:

// 1
// Input 2:

// 6


// Example Output

// Output 1:

// January
// Output 1:

// June


// Example Explanation

// Explanation 1:

// Clearly, January is the 1st month.
// Explanation 2:

// Clearly, June is the 6th month.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A == 1){
            System.out.println("January");
        }
        if(A == 2){
            System.out.println("February");
        }
        if(A == 3){
            System.out.println("March");
        }
        if(A == 4){
            System.out.println("April");
        }
        if(A == 5){
            System.out.println("May");
        }
        if(A == 6){
            System.out.println("June");
        }
        if(A == 7){
            System.out.println("July");
        }
        if(A == 8){
            System.out.println("August");
        }
        if(A == 9){
            System.out.println("September");
        }
        if(A == 10){
            System.out.println("October");
        }
        if(A == 11){
            System.out.println("November");
        }
        if(A == 12){
            System.out.println("December");
        }
    }
}