// 196. Remove duplicates from sorted array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class removeDuplicates{
    public static int removeDuplicates(int[] nums){
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums) set.add(num);
        int idx = 0;
        for(int num : set) nums[idx++] = num;
        return idx;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, result)));
    }
}