// Problem Description
// Write a function that takes to positive integers A and B and returns their LCM.


// Problem Constraints
// 1 <= A,B <= 109


// Input Format
// The first argument is a single integer A
// The second argument is a single integer B


// Output Format
// Return a single integer that is the LCM of A and B.


// Example Input
// Input 1:
// A = 5
// B = 10
// Input 2:

// A = 2
// B = 3


// Example Output
// Output 1:
// 10
// Output 2:

// 6


// Example Explanation
// Explanation 1:
// LCM(5,10)=10
// Explanation 2:

// LCM(2,3)=6

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
        int B = sc.nextInt();
        int gcd = 1;
        int lcm = 0;
        for(int i = 2; i <=A && i <=B; i++){
            if(A % i == 0 && B % i == 0){
                gcd = i;
            }
        }
        lcm = (A * B) / gcd;
        System.out.println(lcm);
    }
}