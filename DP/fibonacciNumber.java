// 299. Fibonacci Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class fibonacciNumber{
    public static int fib(int n){
        if(n <= 1) return n;
        int[] dp = new int[n];
        dp[0] = 0; dp[1] = 1;
        for(int i = 2;i < n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        int result = fib(n);
        System.out.println(result);
    }
}