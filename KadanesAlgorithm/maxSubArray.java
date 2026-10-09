// 12. Kadane's Algorithm
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxSubArray{
    public static int maxSub(int[] nums){
        int currSum = 0; int maxSum = Integer.MIN_VALUE;
        for(int num : nums){
            currSum = currSum + num;
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = maxSub(nums);
        System.out.println(result);
    }
}