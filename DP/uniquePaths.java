// 17. Grid unique paths
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class uniquePaths{
    public static int uniquePaths(int m, int n){
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0;i < m; i++){
            for(int j = 0;j < n; j++){
                if(i == 0 || j == 0) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the M : ");
        int m = scan.nextInt();
        System.out.println("Enetr the N : ");
        int n = scan.nextInt();
        int result = uniquePaths(m, n);
        System.out.println(result);
    }
}
