// 129.find peak Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class peakElement{
    public static int peakElements(int[] nums){
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i - 1] < nums[i] && nums[i] > nums[i + 1]){
                return i;
            }
        }
        return nums[0] > nums[1] ? 0 : nums.length - 1;
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