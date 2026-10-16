// Best Time to Buy and Sell
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class BuyandSell{
    public static int bestTime(int[]  nums){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num - min);
        }
        return max;
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
        int result = bestTime(nums);
        System.out.println(result);
    }
}