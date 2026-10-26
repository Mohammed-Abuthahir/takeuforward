// 138. Find the repeating and missing number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findMissingRepeatingNumbers{
    public static int[] findMissing(int[] nums){
        int[] freq = new int[nums.length + 1];
        for(int num : nums) freq[num]++;
        int[] arr = new int[2];
        for(int i = 1;i < freq.length; i++){
            if(freq[i] == 2) arr[0] = i;
            if(freq[i] == 0) arr[1] = i;
        }
        return arr;
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
        int[] result = findMissing(nums);
        System.out.println(Arrays.toString(result));
    }
}