// // Photo Frame Pattern
// Problem Description
// Take an integer N as input, print the corresponding pattern for N.

// For example if N = 5 then pattern will be like:

// *****
// *   *
// *   *
// *   *
// *****
// Note : Except for the first line and the last line, every line will have N-2 spaces between the two stars.


// Problem Constraints
// 3 <= N <= 100


// Input Format
// First and only line of input contains a single integer N.

// Output Format
// Output the pattern corresponding to the given N.



// Example Input
// Input 1:

//  3
// Input 2:

//  4


// Example Output
// Output 1:

// ***
// * *
// ***
// Output 2:

 
// ****
// *  *
// *  *
// ****


import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Print top row
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print middle rows
        for (int i = 2; i <= n - 1; i++) {
            System.out.print("*");
            for (int j = 2; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        // Print bottom row
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        sc.close();
    }
}


// Here's how the program works:

// First, Take the input from user or machine
// Then it prints the top row of asterisks using a for loop.
// Next, it prints the middle rows of the pattern. This is done using two nested for loops: one to iterate over the rows, and one to iterate over the columns within each row. For each row, it prints an asterisk, followed by n-2 spaces, followed by another asterisk.
// Finally, it prints the bottom row of asterisks using another for loop.
// Note that this program assumes that the input n is greater than or equal to 3. If n is less than 3, the program will not print a valid pattern.