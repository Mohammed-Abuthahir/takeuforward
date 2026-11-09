// 129.find peak Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class peakElement{
    public static int peakElements(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            }
            else left = mid + 1;
        }
        return left;
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
        int result = peakElements(nums);
        System.out.println("Peak Elements index : "+result);
    }
}