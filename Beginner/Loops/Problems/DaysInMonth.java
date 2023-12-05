// Problem Description

// You are given an integer A.

// You have to tell how many days are there in the month denoted by A in a non-leap year.

// Months are denoted as follows:

// January : 1
// February : 2
// March : 3
// April : 4
// May : 5
// June : 6
// July : 7
// August : 8
// September : 9
// October : 10
// November : 11
// December : 12


// Problem Constraints

// 1 <= A <= 12



// Input Format

// The input contains a single integer A.



// Output Format

// Print a single integer denoting the number of days on a single line.



// Example Input

// Input 1:

//  1 
// Input 2:

//  11 


// Example Output

// Output 1:

//  31 
// Output 2:

//  30 


// Example Explanation

// Explanation 1:

//  Number of days in January(1) in a non-leap year = 31.
// Explanation 2:

//  Number of days in November(11) in a non-leap year = 30.


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
        if(A == 1 || A == 3 || A == 5 || A == 7 || A == 8 || A == 10 || A == 12){
            System.out.println("31");
        }
        if(A == 2){
            System.out.println("28");
        }
        if(A == 1 || A == 2 || A == 4 || A == 6 || A == 9 || A == 11){
            System.out.println("30");
        }
    }
}




