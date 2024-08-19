public class FibonacciCalculator {

    // Recursive static method to return the nth term in the Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Main method to call the fibonacci method and output the 10th term
    public static void main(String[] args) {
        int n = 10;
        int nthTerm = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}
