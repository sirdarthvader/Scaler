// Skip Even Numbers Half Pyramid
// Problem Description
// Take an integer N as input, print the corresponding pattern for N.

// For example if N = 5 then pattern will be like:

// 1
// 1_
// 1_3
// 1_3_
// 1_3_5

// Note : Here '_' represents space for explanation purpose only. You have to print space in your code.
// Problem Constraints
// 1 <= N <= 100

// Example Input
// Input 1:

//  2
// Input 2:

//  3


// Example Output
// Output 1:

// 1
// 1 
// Output 2:

//  1
//  1 
//  1 3
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // init scanner
        int N = sc.nextInt(); // read integer

        for(int i = 1; i <= N; i++){ // loop for the no. of rows
            for(int j = 1; j <= i; j++){ // loop for no. of columns
                if(j % 2 == 0){
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}