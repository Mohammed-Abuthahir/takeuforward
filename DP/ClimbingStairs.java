// 7. Climbing stairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ClimbingStairs{
    // public static int climb(int n, int[] dp){
    //     if(n <= 1) return 1;
    //     if(dp[n] != -1){
    //         return dp[n];
    //     }
    //     return dp[n] = climb(n - 1, dp) + climb(n - 2, dp);
    // }
    // public static int climbing(int n){
    //     int[] dp = new int[n + 1];
    //     Arrays.fill(dp, -1);
    //     return climb(n, dp);
    // }
    public static int climbing(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1; dp[1] = 2;
        for(int i = 2;i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = scan.nextInt();
        int result = climbing(n);
        System.out.println(result);
    }
}