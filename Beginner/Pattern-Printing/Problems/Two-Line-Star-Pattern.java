// Problem Description
// Take an integer N as input, print the corresponding pattern for N.

// For example if N = 5 then pattern will be like:

// *   *
// *   *
// *   *
// *   *
// *   *
// Note : Here there are N-2 blank spaces between the stars in each line. You have to print space in your code.

// Example Input
// Input 1:

//  2
// Input 2:

//  3


// Example Output
// Output 1:

// **
// **
// Output 2:

 
//  * *
//  * *
//  * *

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if(N == 1){
            System.out.print("*");
        }

        for(int i = 1; i <= N; i++){
            System.out.print("*");
            for(int j = 1; j <= N - 2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}