// 99. House robber
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class houserobber2{
    public static int houseRobber(int[] nums){
        if(nums.length == 1) return nums[0];
        int n = nums.length;
        int[] temp1 = nums.clone();
        temp1[0] = 0;
        int[] dp1 = new int[n];
        dp1[0] = temp1[0]; dp1[1] = Math.max(temp1[0], temp1[1]);
        for(int i = 2;i < temp1.length; i++){
            dp1[i] = Math.max(dp1[i - 1], temp1[i] + dp1[i - 2]);
        }
        int[] temp2 = nums.clone();
        temp2[0] = 0;
        int[] dp2 = new int[n];
        dp2[0] = temp2[0]; dp2[1] = Math.max(temp2[0], temp2[1]);
        for(int i = 2;i < temp2.length; i++){
            dp2[i] = Math.max(dp2[i - 1], temp2[i] + dp2[i - 2]);
        }
        return Math.max(dp1[n - 1], dp2[n - 1]);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = houseRobber(nums);
        System.out.println(result);
    }
}