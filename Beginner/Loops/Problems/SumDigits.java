// Problem Description
// You take a number of test cases, denoted by T as input.For each test case, you should take integers N as input. Your task is to calculate and print the sum of the digits of the given number N.

// Problem Constraints

// 1 <= T <= 1000
// 0 <= N <= 100000000
// Input Format

// The first line is T which means the total number of test cases.
// Each of the next T lines contain an integer N.
// . Output Format

// T lines each containing one integer representing the sum of the digits of the input integer.
// Example Input

// Input 1:
// 2
// 5
// 1001

// Input 2:
// 2
// 123
// 1589
// Example Output

// Output 1:
// 5
// 2

// Output 2:
// 6
// 23
// Example Explanation

// Explanation 1:
// 5 has only 1 digit hence sum is 5.
// For the number 1001, the digits are 1,0,0,1. The Sum(1001) = 1+0+0+1 = 2.

// Explanation 2:
// For the number 123, the digits are 1,2,3. The Sum(123) = 1+2+3 = 6.
// For the number 1589, the digits are 1,5,8,9. The Sum(1589) = 1+5+8+9 = 23.


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <= T; i++){
            int number = sc.nextInt();
            int currentNumber = 0;
            int sum = 0;
            while(number > 0){
                currentNumber = number % 10;
                sum = sum + currentNumber;
                number = number / 10;
            }
            System.out.println(sum);
        }
    }
}