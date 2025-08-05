import java.util.*;
//Space complexity
// public class Main {
//     public static void main(String[] sm) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printFiboSeries(n);
//     }

//     public static void printFiboSeries(int n) {
//         int f = 0, s = 1;
//         if (n >= 0)
//             System.out.print(f + " ");
//         if (n >= 1)
//             System.out.print(s + " ");
//         for (int i = 2; i <= n; i++) {
//             int t = f + s;
//             System.out.print(t + " ");
//             f = s;
//             s = t;
//         }
//         System.out.println();
//     }
// }
//Tabulation dynamic programming
public class dpfibo {
    // Tabulation (bottom-up DP) approach for Fibonacci series
    public static void fibo(int n) {
        if (n < 0)
            return;
        int[] dp = new int[n + 1]; // DP table to store Fibonacci numbers
        dp[0] = 0;
        if (n >= 1)
            dp[1] = 1;
        System.out.print(dp[0] + " ");
        if (n >= 1)
            System.out.print(dp[1] + " ");
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Fill DP table iteratively
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] sm) {
        fibo(10); // Example: prints first 11 Fibonacci numbers (0 to 10)
    }
}