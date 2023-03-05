// // Star Pattern II
// Problem Description

// Write a program to input an integer N from user and print hollow inverted right triangle star pattern of N lines using '*'.

// Problem Constraints
// 1 <= N <= 1000

import java.util.Scanner;

public class HollowInvertedRightTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Print the pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
