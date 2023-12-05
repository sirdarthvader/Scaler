// Problem Description
// Given the Number of Test Cases as T,
// For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.

// A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). 
// A positive proper divisor divides a number without leaving any remainder.


// Problem Constraints
// 1 <= T <= 10
// 1 <= N <= 106


// Input Format
// The first line of the input contains a single integer T. 
// Each of the next T lines contains a single integer N.


// Output Format
// For each testcase, print YES if the given integer is perfect, else print NO, in a separate line


// Example Input
// Input 1:
// 2
// 4
// 6
// Input 2:
// 1
// 3


// Example Output
// Output 1:
// NO
// YES 
// Output 2:
// NO


// Example Explanation
// Explanation 1:
// For the first test case A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
// For the second test case A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
// Explanation 2:
// For the first test case A = 3, the answer is "NO" as sum of its proper divisors = 1, is not equal to 3.


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        //scan the number from input
        //run a loop for till the given number
        //run another loop from 1 till the number and find all the number that divide the current number
        //add all such divisor, if the sum is equal to the current number it is a perfect number.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            int A = sc.nextInt();
            int sum = 0;
            for(int j = 1; j < A; j++){
                if(A % j == 0){
                    sum = sum + j;
                }
            }
            if(sum == A){
                System.out.println("YES");
            } else {
            System.out.println("NO");
            }
        }
    }
}