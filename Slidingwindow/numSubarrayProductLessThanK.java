// 713. Subarray Product Less Than K
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class numSubarrayProductLessThanK{
    public static int numProduct(int[] nums, int k){
        if(k <= 1) return 0;
        int prod = 1;
        int left = 0;
        int count = 0;
        for(int right = 0; right < nums.length; right++){
            prod = prod * nums[right];
            while(prod >= k){
                prod = prod / nums[left];
                left++;
            }
            count = count - (right - left + 1);
        }
        return count;
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
        System.out.println("Enter the K : ");
        int result = numProduct(nums, k);
        System.out.println(result);
    }
}