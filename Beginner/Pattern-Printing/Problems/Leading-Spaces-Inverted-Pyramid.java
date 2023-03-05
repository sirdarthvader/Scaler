// Problem Description
// Take an integer N as input, print the corresponding pattern for N.

// For example if N = 5 then pattern will be like:

// *****
// _****
// __***
// ___**
// ____*
// Note : Here '_' represents space for explanation purpose only. You have to print space in your code.

// There will be 2 loops, one for the stars and one for the dashes. 
// i -> first loop -> outter most
// j -> second loop -> for dashesh ( j = 1 )
// k -> third loop -> for stars

// Problem Constraints
// 1 <= N <= 100

// Input Format
// First and only line of input contains a single integer N.

// Output Format
// Output the pattern corresponding to the given N.

// Example Input
// Input 1:
//  2
// Input 2:
//  3

// Example Output
// Output 1:
// **
// _*
// Output 2:
//  ***
//  _**
//  __*
// Note : Here '_' represents space for explanation purpose only. You have to print space in your code.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            //loop for dashesh
            for(int j=1; j < i; j++){
                System.out.print(" ");
            }
            //loop for stars
            for(int k = 1; k <= (N - i) + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
