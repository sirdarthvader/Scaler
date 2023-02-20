Take an integer N as input, print the corresponding pattern for N.

// Take an integer N as input, print the corresponding pattern for N.
// For example if N = 4 then pattern will be like:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// Problem Constraints
// 1 <= N <= 100  


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // init scanner
        int N = sc.nextInt(); //capture Number of rows
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                if(j < i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



