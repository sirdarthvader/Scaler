// write a program to check if a given nuber is prime or not.

class Main {
	public static void main(String args[]) {
		// Your code goes here
        int count = 0;
        int N = 8;
        for(int i = 0; i <= N; i++){
            if(N % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
	}
}