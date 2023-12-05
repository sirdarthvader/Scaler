// Problem Description
// Take T (number of test cases) as input.
// For each test case, take integer N as input and Print the count of digits of that number.

// Note: No of digits for number 0 is considered as 1.

// Problem Constraints

// 1 &lt;= T &lt;= 100
// 0 &lt;= N &lt;= 100000000
// Input Format

// The first line is the number T which denotes the total number of test cases.
// Next T lines contain an integer N for which you have to print the number of digits.
// Output Format

// For T different Numbers, Print the number of digits in separate lines.
// Example Input

// Input 1: 
// 2
// 0
// 1

// Input 2:
// 2
// 100
// 10101
// Example Output

// Output 1:
// 1
// 1
// Output 2:
// 3
// 5
// Example Explanation

// Explanation 1:
// 0 and 1 both have only one digit.
// Explanation 2:
// 100 has three digits and 10101 has 5 digits.


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
            int count = 0;
            String str_number = Integer.toString(number);
            for(int j = 0; j < str_number.length(); j++){
                count++;
            }
            System.out.println(count);
        }
    }
}