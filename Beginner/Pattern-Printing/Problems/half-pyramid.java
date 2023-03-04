// // // Inverse Half Pyramid Pattern
// // Problem Description
// // Take an Integer N as input. Print an Inverse half pyramid of N lines using *.
// // For example for N = 5, the output should be the following pattern:-

// *****
// ****
// ***
// **
// *

// Sample Input

// 3
// Sample Output

// ***
// **
// *

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = T; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}