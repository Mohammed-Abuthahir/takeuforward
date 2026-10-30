// 285. Maximum Product of Three Numbers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumProduct{
    public static int maximumProductofThreeNumbers(int[] nums){
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[0] * nums[1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
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
        int result = maximumProductofThreeNumbers(nums);
        System.out.println(result);
    }
}
