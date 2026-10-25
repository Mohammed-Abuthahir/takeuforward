// 116. Find missing number
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class missingNumber{
    public static int missingNumbers(int[] nums){
        int n = nums.length - 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int num : nums){
            actualSum = actualSum + num;
        }
        return expectedSum - actualSum;
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
        int result = missingNumbers(nums);
        System.out.println(result);
    }
}