public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // Change this value to compute the factorial of a different number
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to calculate the factorial of a number
    public static long calculateFactorial(int n) {
        if (n == 0) return 1; // Base case: factorial of 0 is 1
        return n * calculateFactorial(n - 1); // Recursive case
    }
}
