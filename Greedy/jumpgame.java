// 24. Jump Game - I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class jumpgame{
    public static boolean jumpGame(int[] nums){
        int i = 0; int max = 0;
        while(i < nums.length){
            if(max >= nums.length - 1) return true;
            max = Math.max(max, nums[i] + i);
            if(max == i) return false;
            i++;
        }
        return true;
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
        boolean result = jumpGame(nums);
        System.out.println(result);
    }
}