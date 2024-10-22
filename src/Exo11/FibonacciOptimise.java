package Exo11;

public class FibonacciOptimise {
    public static int fibonacci(int n, int[] memo) {
        if (n <= 1)
            return n;

        if (memo[n] != 0)
            return memo[n];

        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int[] positions = {0, 3, 9};

        for (int pos : positions) {
            int[] memo = new int[pos + 1];
            System.out.println("The Fibonacci number at position " + pos + " is: " + fibonacci(pos, memo));
        }
    }
}
