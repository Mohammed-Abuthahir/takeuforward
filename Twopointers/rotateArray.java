// 237. Left Rotate Array by K Places
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rotateArray{
    public static void reverse(int[] nums, int left, int right){
        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotateArray(int[] nums, int k){
        if(k == 0) return;
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, nums.length - (k + 1));
        reverse(nums, nums.length - k, nums.length - 1);
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
        int k = scan.nextInt();
        rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}