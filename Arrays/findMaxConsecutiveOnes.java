// 213. Maximum Consecutive Ones
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findMaxConsecutiveOnce{
    public static int maxConsecutive(int[] nums){
        int count = 0;
        int max = 0;
        for(int num : nums){
            if(num == 1) {
                count++;
                max = Math.max(max, count);
            }
            else count = 0;
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
        int result = maxConsecutive(nums);
        System.out.println(result);
    }
}