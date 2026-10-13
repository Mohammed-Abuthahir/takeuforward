// 48. Maximum Product Subarray in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class MaximumProductSub{
    public static int maxProduct(int[] nums){
        int prefix = 1; int suffix = 1; int max = Integer.MIN_VALUE;
        for(int num : nums){
            prefix = prefix * num;
            max = Math.max(max, prefix);
            if(prefix == 0) prefix = 1;
        }
        for(int i = nums.length - 1; i >= 0; i--){
            suffix = suffix * nums[i];
            max = Math.max(max, suffix);
            if(suffix == 0) suffix = 1;
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
        int result = maxProduct(nums);
        System.out.println(result);
    }
}