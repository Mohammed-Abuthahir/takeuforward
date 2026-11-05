// Search in Rotated Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class SearchinRotated{
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            if(nums[left] >= nums[mid]){
                if(nums[left] >= target && nums[mid] < target){
                    right = mid - 1;
                }
                else left = mid + 1;
            }
            else {
                if(nums[mid] < target && nums[right] >= target){
                    left = mid + 1;
                }
                else right = mid - 1;
            }
        }
        return -1;
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
        int result = search(nums, target);
        System.out.println(result);
    }
}