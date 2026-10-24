// 97. Longest Consecutive Sequence in an Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class longestConsecutive{
    public static int longestConsecutive(int[] nums){
        if(nums.length == 0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums) set.add(num);
        int count = 1;
        int max = Integer.MIN_VALUE;
        for(int num : set){
            if(set.contains(num - 1)){
                count++;
                max = Math.max(max, count);
            }
            else count = 1;
        }
        if(max <= 0) return 1;
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
        int result = longestConsecutive(nums);
        System.out.println(result);
    }
}