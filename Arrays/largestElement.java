// 702. Largest Element
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class largestElement{
    public static int largestElement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
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
        int result = largestElement(nums);
        System.out.println(result);
    }
}
