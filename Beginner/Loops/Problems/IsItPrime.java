// Problem Description

// Take an integer A as input, you have to tell whether it is a prime number or not.

// A prime number is a natural number greater than 1 which is divisible only by 1 and itself.


// Problem Constraints

// 1 <= A <= 106



// Input Format

// First and only line of the input contains a single integer A.



// Output Format

// Print YES if A is a prime, else print NO.



// Example Input

// Input 1:

//  3 
// Input 2:

//  4 


// Example Output

// Output 1:

//  YES 
// Output 2:

//  NO 


// Example Explanation

// Explanation 1:

//  3 is a prime number as it is only divisible by 1 and 3.
// Explanation 2:

//  4 is not a prime number as it is divisible by 2.


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
        boolean isPrime = true;
        if(A <= 1){
            System.out.print("NO");
        }
        for(int i = 2; i < A; i++){
            if(A % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        
    }
}