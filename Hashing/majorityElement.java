// 83. Majority Element-I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class majorityElement{
    public static int majority(int[] nums){
        int candidate = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }
            else count--;
        }
        return candidate;
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
        int result = majority(nums);
        System.out.println(result);
    }
}