// Find First and Last Position of Element in Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class searchRange{
    public static int[] searchRange(int[] nums, int target){
        int firstElement = firstElement(nums, target);
        int lastElement = lastElement(nums, target);
        return new int[]{firstElement, lastElement};
    }
    public static int firstElement(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                ans = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return ans;
    }
    public static int lastElement(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                ans = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return ans;
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
        System.out.println("Enter the Target : ");
        int target = scan.nextInt();
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
