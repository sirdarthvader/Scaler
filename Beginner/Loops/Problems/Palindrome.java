// Problem Description

// Determine whether an integer is a palindrome. Do this without extra space.

// A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed. Negative numbers are not palindromic.

// Example :

// Input : 12121
// Output : True

// Input : 123
// Output : False

public class Solution {
    public int isPalindrome(int A) {
        // Find the appropriate divisor
        // to extract the leading digit
        if( A < 0){
            return 0;
        }
        int divisor = 1;
        while (A / divisor >= 10)
            divisor *= 10;
      
        while (A != 0)
        {
            int leading = A / divisor;
            int trailing = A % 10;
      
            // If first and last digit
            // not same return false
            if (leading != trailing) 
                return 0;
      
            // Removing the leading and trailing
            // digit from number
            A = (A % divisor) / 10;
      
            // Reducing divisor by a factor
            // of 2 as 2 digits are dropped
            divisor = divisor / 100;
        }
        return 1;
    }
}
