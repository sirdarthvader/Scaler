// Problem Description
// Take an integer N as input, print the corresponding pattern for N.

// For example if N = 5 then pattern will be like:

// ____*
// ___**
// __***
// _****
// *****
// Note : Here '_' represents space for explanation purpose only. You have to print space in your code.

// Rough Notes
// i | j 
// 1 | N - i


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++ ){
            //loop for dashes
            for(int j = 1; j <= N - i; j++){
                System.out.print(" ");
            }
            //loop for stars
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}