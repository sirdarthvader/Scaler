class Main {
    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }

    }

    /*
     * if(condition => T/F)
     */
    /* Write a function to check if a number is prime */
    public static boolean isPrime(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        if (factors == 2) {
            return true;
        } else
            return false;
    }

    /*
     * function to return the sum of two numbers
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /*
     * Write a function that takes the length and breadth of a rectangle
     * and returns the area
     */
    public static int reactangleArea(int l, int b) {
        return l * b;
    }
    /*
     * Write function to get area of
     * - Square
     * - triangle
     * - double Circle (pi => 22/7)
     */
    /*
     * Write the function to return the volume of
     * - Sphere
     * - Cuboid
     * - Cylinder
     */
    /*
     * Write functions that returns the
     * - max of a and b
     * - max of a, b, and c
     * - min of a, b
     * - min of a, b, c
     * 
     */

    public static boolean isEven(int num) {
        // System.out.println(num);
        if (num % 2 == 0) {
            // System.out.println("Number is even");
            return true;
        } else {
            // System.out.println("Number is odd");
            return false;
        }

    }
}

/*
 * if(condition)
 * System.out.println("Yeyyy!");
 * 
 * if(condition){
 * System.out.println("Yeyyy!");
 * }
 * if(condition)
 * System.out.println("Yeyyy!");
 * System.out.println("Neyyy!");
 * 
 * if(condition){
 * System.out.println("Yeyyy!");
 * }
 * System.out.println("Neyyy!");
 */