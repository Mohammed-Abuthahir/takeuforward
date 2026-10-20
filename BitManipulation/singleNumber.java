// 63. Single Number - I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class singleNumber{
    public static int singleNumber(int[] nums){
        int xor = 0;
        for(int num : nums){
            xor = xor ^ num;
        }
        return xor;
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
        int result = singleNumber(nums);
        System.out.println(result);
    }
}